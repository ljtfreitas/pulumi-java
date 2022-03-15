// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1beta.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class CloudBuildOptionsResponse {
    /**
     * Path to the yaml file used in deployment, used to determine runtime configuration details.Required for flexible environment builds.See https://cloud.google.com/appengine/docs/standard/python/config/appref for more details.
     * 
     */
    private final String appYamlPath;
    /**
     * The Cloud Build timeout used as part of any dependent builds performed by version creation. Defaults to 10 minutes.
     * 
     */
    private final String cloudBuildTimeout;

    @CustomType.Constructor
    private CloudBuildOptionsResponse(
        @CustomType.Parameter("appYamlPath") String appYamlPath,
        @CustomType.Parameter("cloudBuildTimeout") String cloudBuildTimeout) {
        this.appYamlPath = appYamlPath;
        this.cloudBuildTimeout = cloudBuildTimeout;
    }

    /**
     * Path to the yaml file used in deployment, used to determine runtime configuration details.Required for flexible environment builds.See https://cloud.google.com/appengine/docs/standard/python/config/appref for more details.
     * 
    */
    public String getAppYamlPath() {
        return this.appYamlPath;
    }
    /**
     * The Cloud Build timeout used as part of any dependent builds performed by version creation. Defaults to 10 minutes.
     * 
    */
    public String getCloudBuildTimeout() {
        return this.cloudBuildTimeout;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudBuildOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String appYamlPath;
        private String cloudBuildTimeout;

        public Builder() {
    	      // Empty
        }

        public Builder(CloudBuildOptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appYamlPath = defaults.appYamlPath;
    	      this.cloudBuildTimeout = defaults.cloudBuildTimeout;
        }

        public Builder appYamlPath(String appYamlPath) {
            this.appYamlPath = Objects.requireNonNull(appYamlPath);
            return this;
        }

        public Builder cloudBuildTimeout(String cloudBuildTimeout) {
            this.cloudBuildTimeout = Objects.requireNonNull(cloudBuildTimeout);
            return this;
        }
        public CloudBuildOptionsResponse build() {
            return new CloudBuildOptionsResponse(appYamlPath, cloudBuildTimeout);
        }
    }
}
