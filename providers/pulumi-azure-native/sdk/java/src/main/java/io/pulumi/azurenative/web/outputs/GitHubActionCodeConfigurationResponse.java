// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GitHubActionCodeConfigurationResponse {
    /**
     * Runtime stack is used to determine the workflow file content for code base apps.
     * 
     */
    private final @Nullable String runtimeStack;
    /**
     * Runtime version is used to determine what build version to set in the workflow file.
     * 
     */
    private final @Nullable String runtimeVersion;

    @CustomType.Constructor
    private GitHubActionCodeConfigurationResponse(
        @CustomType.Parameter("runtimeStack") @Nullable String runtimeStack,
        @CustomType.Parameter("runtimeVersion") @Nullable String runtimeVersion) {
        this.runtimeStack = runtimeStack;
        this.runtimeVersion = runtimeVersion;
    }

    /**
     * Runtime stack is used to determine the workflow file content for code base apps.
     * 
    */
    public Optional<String> getRuntimeStack() {
        return Optional.ofNullable(this.runtimeStack);
    }
    /**
     * Runtime version is used to determine what build version to set in the workflow file.
     * 
    */
    public Optional<String> getRuntimeVersion() {
        return Optional.ofNullable(this.runtimeVersion);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GitHubActionCodeConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String runtimeStack;
        private @Nullable String runtimeVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(GitHubActionCodeConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.runtimeStack = defaults.runtimeStack;
    	      this.runtimeVersion = defaults.runtimeVersion;
        }

        public Builder runtimeStack(@Nullable String runtimeStack) {
            this.runtimeStack = runtimeStack;
            return this;
        }

        public Builder runtimeVersion(@Nullable String runtimeVersion) {
            this.runtimeVersion = runtimeVersion;
            return this;
        }
        public GitHubActionCodeConfigurationResponse build() {
            return new GitHubActionCodeConfigurationResponse(runtimeStack, runtimeVersion);
        }
    }
}
