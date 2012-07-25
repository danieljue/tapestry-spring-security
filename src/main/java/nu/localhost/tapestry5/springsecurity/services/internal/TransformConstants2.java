// Copyright 2006, 2007, 2008, 2009, 2011 The Apache Software Foundation
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package nu.localhost.tapestry5.springsecurity.services.internal;

import org.apache.tapestry5.MarkupWriter;
import org.apache.tapestry5.plastic.MethodDescription;
import org.apache.tapestry5.plastic.PlasticUtils;
import org.apache.tapestry5.runtime.Component;
import org.apache.tapestry5.runtime.ComponentEvent;
import org.apache.tapestry5.runtime.Event;
import org.apache.tapestry5.runtime.PageLifecycleListener;
import org.apache.tapestry5.services.transform.ComponentClassTransformWorker2;

/**
 * Constants used by implementations of {@link org.apache.tapestry5.services.ComponentClassTransformWorker} and
 * {@link ComponentClassTransformWorker2}.
 * <p/>
 * Note: methods on transformed components will not be invoked <em>unless</em>
 * {@linkplain org.apache.tapestry5.model.MutableComponentModel#addRenderPhase(Class) the component model is updated to
 * identify the use of the corresponding render phase}.
 */
public final class TransformConstants2
{
    // Shared parameters of a whole bunch of lifecycle methods, representing the different
    // component render states.
    private static final String[] RENDER_PHASE_METHOD_PARAMETERS =
    { MarkupWriter.class.getName(), Event.class.getName() };

    private static final Class[] RENDER_PHASE_METHOD_PARAMETER_TYPES =
    { MarkupWriter.class, Event.class };


    /**
     * Description for
     * {@link org.apache.tapestry5.runtime.Component#dispatchComponentEvent(org.apache.tapestry5.runtime.ComponentEvent)}
     * .
     * 
     * @see org.apache.tapestry5.annotations.OnEvent
     * @since 5.3.0
     */
    public static final MethodDescription DISPATCH_COMPONENT_EVENT_DESCRIPTION = PlasticUtils.getMethodDescription(
            Component.class, "dispatchComponentEvent", ComponentEvent.class);


    /**
     * Description for {@link org.apache.tapestry5.runtime.PageLifecycleListener#containingPageDidLoad()}.
     * 
     * @since 5.3.0
     */
    public static final MethodDescription CONTAINING_PAGE_DID_LOAD_DESCRIPTION = PlasticUtils.getMethodDescription(
            PageLifecycleListener.class, "containingPageDidLoad");



    /**
     * Description for {@link org.apache.tapestry5.runtime.Component#setupRender(MarkupWriter, Event)}.
     * 
     * @see org.apache.tapestry5.annotations.SetupRender
     * @since 5.3.0
     */
    public static final MethodDescription SETUP_RENDER_DESCRIPTION = PlasticUtils.getMethodDescription(Component.class,
            "setupRender", RENDER_PHASE_METHOD_PARAMETER_TYPES);


    /**
     * Description for {@link org.apache.tapestry5.runtime.Component#beginRender(MarkupWriter, Event)}.
     * 
     * @see org.apache.tapestry5.annotations.BeginRender
     * @since 5.3.0
     */
    public static final MethodDescription BEGIN_RENDER_DESCRIPTION  = PlasticUtils.getMethodDescription(Component.class,
            "beginRender", RENDER_PHASE_METHOD_PARAMETER_TYPES);

 

    /**
     * Description for {@link org.apache.tapestry5.runtime.Component#cleanupRender(MarkupWriter, Event)}.
     * 
     * @see org.apache.tapestry5.annotations.CleanupRender
     * @since 5.3.0
     */
    public static final MethodDescription CLEANUP_RENDER_DESCRIPTION  = PlasticUtils.getMethodDescription(Component.class,
            "cleanupRender", RENDER_PHASE_METHOD_PARAMETER_TYPES);


}
