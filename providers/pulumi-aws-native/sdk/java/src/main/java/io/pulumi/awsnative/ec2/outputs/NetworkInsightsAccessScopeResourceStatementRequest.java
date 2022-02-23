// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class NetworkInsightsAccessScopeResourceStatementRequest {
    private final @Nullable List<String> resourceTypes;
    private final @Nullable List<String> resources;

    @OutputCustomType.Constructor({"resourceTypes","resources"})
    private NetworkInsightsAccessScopeResourceStatementRequest(
        @Nullable List<String> resourceTypes,
        @Nullable List<String> resources) {
        this.resourceTypes = resourceTypes;
        this.resources = resources;
    }

    public List<String> getResourceTypes() {
        return this.resourceTypes == null ? List.of() : this.resourceTypes;
    }
    public List<String> getResources() {
        return this.resources == null ? List.of() : this.resources;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkInsightsAccessScopeResourceStatementRequest defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> resourceTypes;
        private @Nullable List<String> resources;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkInsightsAccessScopeResourceStatementRequest defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceTypes = defaults.resourceTypes;
    	      this.resources = defaults.resources;
        }

        public Builder setResourceTypes(@Nullable List<String> resourceTypes) {
            this.resourceTypes = resourceTypes;
            return this;
        }

        public Builder setResources(@Nullable List<String> resources) {
            this.resources = resources;
            return this;
        }
        public NetworkInsightsAccessScopeResourceStatementRequest build() {
            return new NetworkInsightsAccessScopeResourceStatementRequest(resourceTypes, resources);
        }
    }
}
