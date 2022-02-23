// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.imagebuilder.outputs;

import io.pulumi.awsnative.imagebuilder.outputs.DistributionConfigurationDistribution;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetDistributionConfigurationResult {
    /**
     * The Amazon Resource Name (ARN) of the distribution configuration.
     * 
     */
    private final @Nullable String arn;
    /**
     * The description of the distribution configuration.
     * 
     */
    private final @Nullable String description;
    /**
     * The distributions of the distribution configuration.
     * 
     */
    private final @Nullable List<DistributionConfigurationDistribution> distributions;
    /**
     * The tags associated with the component.
     * 
     */
    private final @Nullable Object tags;

    @OutputCustomType.Constructor({"arn","description","distributions","tags"})
    private GetDistributionConfigurationResult(
        @Nullable String arn,
        @Nullable String description,
        @Nullable List<DistributionConfigurationDistribution> distributions,
        @Nullable Object tags) {
        this.arn = arn;
        this.description = description;
        this.distributions = distributions;
        this.tags = tags;
    }

    /**
     * The Amazon Resource Name (ARN) of the distribution configuration.
     * 
     */
    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    /**
     * The description of the distribution configuration.
     * 
     */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The distributions of the distribution configuration.
     * 
     */
    public List<DistributionConfigurationDistribution> getDistributions() {
        return this.distributions == null ? List.of() : this.distributions;
    }
    /**
     * The tags associated with the component.
     * 
     */
    public Optional<Object> getTags() {
        return Optional.ofNullable(this.tags);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDistributionConfigurationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String description;
        private @Nullable List<DistributionConfigurationDistribution> distributions;
        private @Nullable Object tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDistributionConfigurationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.description = defaults.description;
    	      this.distributions = defaults.distributions;
    	      this.tags = defaults.tags;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setDistributions(@Nullable List<DistributionConfigurationDistribution> distributions) {
            this.distributions = distributions;
            return this;
        }

        public Builder setTags(@Nullable Object tags) {
            this.tags = tags;
            return this;
        }
        public GetDistributionConfigurationResult build() {
            return new GetDistributionConfigurationResult(arn, description, distributions, tags);
        }
    }
}
