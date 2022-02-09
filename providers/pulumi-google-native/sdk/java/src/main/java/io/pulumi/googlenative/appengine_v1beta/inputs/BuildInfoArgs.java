// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1beta.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BuildInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final BuildInfoArgs Empty = new BuildInfoArgs();

    @InputImport(name="cloudBuildId")
    private final @Nullable Input<String> cloudBuildId;

    public Input<String> getCloudBuildId() {
        return this.cloudBuildId == null ? Input.empty() : this.cloudBuildId;
    }

    public BuildInfoArgs(@Nullable Input<String> cloudBuildId) {
        this.cloudBuildId = cloudBuildId;
    }

    private BuildInfoArgs() {
        this.cloudBuildId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BuildInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> cloudBuildId;

        public Builder() {
    	      // Empty
        }

        public Builder(BuildInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudBuildId = defaults.cloudBuildId;
        }

        public Builder setCloudBuildId(@Nullable Input<String> cloudBuildId) {
            this.cloudBuildId = cloudBuildId;
            return this;
        }

        public Builder setCloudBuildId(@Nullable String cloudBuildId) {
            this.cloudBuildId = Input.ofNullable(cloudBuildId);
            return this;
        }

        public BuildInfoArgs build() {
            return new BuildInfoArgs(cloudBuildId);
        }
    }
}