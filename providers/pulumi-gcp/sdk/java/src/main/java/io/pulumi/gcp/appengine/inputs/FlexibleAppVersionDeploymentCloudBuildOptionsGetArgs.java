// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.appengine.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FlexibleAppVersionDeploymentCloudBuildOptionsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final FlexibleAppVersionDeploymentCloudBuildOptionsGetArgs Empty = new FlexibleAppVersionDeploymentCloudBuildOptionsGetArgs();

    /**
     * Path to the yaml file used in deployment, used to determine runtime configuration details.
     * 
     */
    @Import(name="appYamlPath", required=true)
      private final Output<String> appYamlPath;

    public Output<String> getAppYamlPath() {
        return this.appYamlPath;
    }

    /**
     * The Cloud Build timeout used as part of any dependent builds performed by version creation. Defaults to 10 minutes.
     * A duration in seconds with up to nine fractional digits, terminated by 's'. Example: "3.5s".
     * 
     */
    @Import(name="cloudBuildTimeout")
      private final @Nullable Output<String> cloudBuildTimeout;

    public Output<String> getCloudBuildTimeout() {
        return this.cloudBuildTimeout == null ? Output.empty() : this.cloudBuildTimeout;
    }

    public FlexibleAppVersionDeploymentCloudBuildOptionsGetArgs(
        Output<String> appYamlPath,
        @Nullable Output<String> cloudBuildTimeout) {
        this.appYamlPath = Objects.requireNonNull(appYamlPath, "expected parameter 'appYamlPath' to be non-null");
        this.cloudBuildTimeout = cloudBuildTimeout;
    }

    private FlexibleAppVersionDeploymentCloudBuildOptionsGetArgs() {
        this.appYamlPath = Output.empty();
        this.cloudBuildTimeout = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlexibleAppVersionDeploymentCloudBuildOptionsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> appYamlPath;
        private @Nullable Output<String> cloudBuildTimeout;

        public Builder() {
    	      // Empty
        }

        public Builder(FlexibleAppVersionDeploymentCloudBuildOptionsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appYamlPath = defaults.appYamlPath;
    	      this.cloudBuildTimeout = defaults.cloudBuildTimeout;
        }

        public Builder appYamlPath(Output<String> appYamlPath) {
            this.appYamlPath = Objects.requireNonNull(appYamlPath);
            return this;
        }

        public Builder appYamlPath(String appYamlPath) {
            this.appYamlPath = Output.of(Objects.requireNonNull(appYamlPath));
            return this;
        }

        public Builder cloudBuildTimeout(@Nullable Output<String> cloudBuildTimeout) {
            this.cloudBuildTimeout = cloudBuildTimeout;
            return this;
        }

        public Builder cloudBuildTimeout(@Nullable String cloudBuildTimeout) {
            this.cloudBuildTimeout = Output.ofNullable(cloudBuildTimeout);
            return this;
        }
        public FlexibleAppVersionDeploymentCloudBuildOptionsGetArgs build() {
            return new FlexibleAppVersionDeploymentCloudBuildOptionsGetArgs(appYamlPath, cloudBuildTimeout);
        }
    }
}
