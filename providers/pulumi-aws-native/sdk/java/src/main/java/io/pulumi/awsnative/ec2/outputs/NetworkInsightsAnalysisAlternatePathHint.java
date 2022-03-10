// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class NetworkInsightsAnalysisAlternatePathHint {
    private final @Nullable String componentArn;
    private final @Nullable String componentId;

    @OutputCustomType.Constructor
    private NetworkInsightsAnalysisAlternatePathHint(
        @OutputCustomType.Parameter("componentArn") @Nullable String componentArn,
        @OutputCustomType.Parameter("componentId") @Nullable String componentId) {
        this.componentArn = componentArn;
        this.componentId = componentId;
    }

    public Optional<String> getComponentArn() {
        return Optional.ofNullable(this.componentArn);
    }
    public Optional<String> getComponentId() {
        return Optional.ofNullable(this.componentId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkInsightsAnalysisAlternatePathHint defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String componentArn;
        private @Nullable String componentId;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkInsightsAnalysisAlternatePathHint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.componentArn = defaults.componentArn;
    	      this.componentId = defaults.componentId;
        }

        public Builder setComponentArn(@Nullable String componentArn) {
            this.componentArn = componentArn;
            return this;
        }

        public Builder setComponentId(@Nullable String componentId) {
            this.componentId = componentId;
            return this;
        }
        public NetworkInsightsAnalysisAlternatePathHint build() {
            return new NetworkInsightsAnalysisAlternatePathHint(componentArn, componentId);
        }
    }
}
