// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudtasks_v2beta3.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.cloudtasks_v2beta3.outputs.AppEngineRoutingResponse;
import java.util.Objects;

@CustomType
public final class AppEngineHttpQueueResponse {
    /**
     * Overrides for the task-level app_engine_routing. If set, `app_engine_routing_override` is used for all tasks in the queue, no matter what the setting is for the task-level app_engine_routing.
     * 
     */
    private final AppEngineRoutingResponse appEngineRoutingOverride;

    @CustomType.Constructor
    private AppEngineHttpQueueResponse(@CustomType.Parameter("appEngineRoutingOverride") AppEngineRoutingResponse appEngineRoutingOverride) {
        this.appEngineRoutingOverride = appEngineRoutingOverride;
    }

    /**
     * Overrides for the task-level app_engine_routing. If set, `app_engine_routing_override` is used for all tasks in the queue, no matter what the setting is for the task-level app_engine_routing.
     * 
    */
    public AppEngineRoutingResponse getAppEngineRoutingOverride() {
        return this.appEngineRoutingOverride;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppEngineHttpQueueResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppEngineRoutingResponse appEngineRoutingOverride;

        public Builder() {
    	      // Empty
        }

        public Builder(AppEngineHttpQueueResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appEngineRoutingOverride = defaults.appEngineRoutingOverride;
        }

        public Builder appEngineRoutingOverride(AppEngineRoutingResponse appEngineRoutingOverride) {
            this.appEngineRoutingOverride = Objects.requireNonNull(appEngineRoutingOverride);
            return this;
        }
        public AppEngineHttpQueueResponse build() {
            return new AppEngineHttpQueueResponse(appEngineRoutingOverride);
        }
    }
}
