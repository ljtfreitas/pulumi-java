// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.advisor.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetSuppressionArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetSuppressionArgs Empty = new GetSuppressionArgs();

    /**
     * The name of the suppression.
     * 
     */
    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * The recommendation ID.
     * 
     */
    @InputImport(name="recommendationId", required=true)
    private final String recommendationId;

    public String getRecommendationId() {
        return this.recommendationId;
    }

    /**
     * The fully qualified Azure Resource Manager identifier of the resource to which the recommendation applies.
     * 
     */
    @InputImport(name="resourceUri", required=true)
    private final String resourceUri;

    public String getResourceUri() {
        return this.resourceUri;
    }

    public GetSuppressionArgs(
        String name,
        String recommendationId,
        String resourceUri) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.recommendationId = Objects.requireNonNull(recommendationId, "expected parameter 'recommendationId' to be non-null");
        this.resourceUri = Objects.requireNonNull(resourceUri, "expected parameter 'resourceUri' to be non-null");
    }

    private GetSuppressionArgs() {
        this.name = null;
        this.recommendationId = null;
        this.resourceUri = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSuppressionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String recommendationId;
        private String resourceUri;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSuppressionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.recommendationId = defaults.recommendationId;
    	      this.resourceUri = defaults.resourceUri;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setRecommendationId(String recommendationId) {
            this.recommendationId = Objects.requireNonNull(recommendationId);
            return this;
        }

        public Builder setResourceUri(String resourceUri) {
            this.resourceUri = Objects.requireNonNull(resourceUri);
            return this;
        }

        public GetSuppressionArgs build() {
            return new GetSuppressionArgs(name, recommendationId, resourceUri);
        }
    }
}
