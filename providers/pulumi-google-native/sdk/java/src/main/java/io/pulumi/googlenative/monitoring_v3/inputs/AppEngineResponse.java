// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v3.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * App Engine service. Learn more at https://cloud.google.com/appengine.
 * 
 */
public final class AppEngineResponse extends io.pulumi.resources.InvokeArgs {

    public static final AppEngineResponse Empty = new AppEngineResponse();

    /**
     * The ID of the App Engine module underlying this service. Corresponds to the module_id resource label in the gae_app monitored resource: https://cloud.google.com/monitoring/api/resources#tag_gae_app
     * 
     */
    @InputImport(name="moduleId", required=true)
      private final String moduleId;

    public String getModuleId() {
        return this.moduleId;
    }

    public AppEngineResponse(String moduleId) {
        this.moduleId = Objects.requireNonNull(moduleId, "expected parameter 'moduleId' to be non-null");
    }

    private AppEngineResponse() {
        this.moduleId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppEngineResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String moduleId;

        public Builder() {
    	      // Empty
        }

        public Builder(AppEngineResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.moduleId = defaults.moduleId;
        }

        public Builder setModuleId(String moduleId) {
            this.moduleId = Objects.requireNonNull(moduleId);
            return this;
        }
        public AppEngineResponse build() {
            return new AppEngineResponse(moduleId);
        }
    }
}
