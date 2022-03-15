// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.imagebuilder.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetInfrastructureConfigurationArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetInfrastructureConfigurationArgs Empty = new GetInfrastructureConfigurationArgs();

    /**
     * Amazon Resource Name (ARN) of the infrastructure configuration.
     * 
     */
    @Import(name="arn", required=true)
      private final String arn;

    public String getArn() {
        return this.arn;
    }

    /**
     * Key-value map of resource tags for the infrastructure created by the infrastructure configuration.
     * 
     */
    @Import(name="resourceTags")
      private final @Nullable Map<String,String> resourceTags;

    public Map<String,String> getResourceTags() {
        return this.resourceTags == null ? Map.of() : this.resourceTags;
    }

    /**
     * Key-value map of resource tags for the infrastructure configuration.
     * 
     */
    @Import(name="tags")
      private final @Nullable Map<String,String> tags;

    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }

    public GetInfrastructureConfigurationArgs(
        String arn,
        @Nullable Map<String,String> resourceTags,
        @Nullable Map<String,String> tags) {
        this.arn = Objects.requireNonNull(arn, "expected parameter 'arn' to be non-null");
        this.resourceTags = resourceTags;
        this.tags = tags;
    }

    private GetInfrastructureConfigurationArgs() {
        this.arn = null;
        this.resourceTags = Map.of();
        this.tags = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInfrastructureConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private @Nullable Map<String,String> resourceTags;
        private @Nullable Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInfrastructureConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.resourceTags = defaults.resourceTags;
    	      this.tags = defaults.tags;
        }

        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder resourceTags(@Nullable Map<String,String> resourceTags) {
            this.resourceTags = resourceTags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public GetInfrastructureConfigurationArgs build() {
            return new GetInfrastructureConfigurationArgs(arn, resourceTags, tags);
        }
    }
}
