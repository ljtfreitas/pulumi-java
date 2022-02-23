// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.imagebuilder.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDistributionConfigurationArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetDistributionConfigurationArgs Empty = new GetDistributionConfigurationArgs();

    /**
     * Amazon Resource Name (ARN) of the distribution configuration.
     * 
     */
    @InputImport(name="arn", required=true)
    private final String arn;

    public String getArn() {
        return this.arn;
    }

    /**
     * Key-value map of resource tags for the distribution configuration.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Map<String,String> tags;

    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }

    public GetDistributionConfigurationArgs(
        String arn,
        @Nullable Map<String,String> tags) {
        this.arn = Objects.requireNonNull(arn, "expected parameter 'arn' to be non-null");
        this.tags = tags;
    }

    private GetDistributionConfigurationArgs() {
        this.arn = null;
        this.tags = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDistributionConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private @Nullable Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDistributionConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.tags = defaults.tags;
        }

        public Builder setArn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public GetDistributionConfigurationArgs build() {
            return new GetDistributionConfigurationArgs(arn, tags);
        }
    }
}
