// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kendra.outputs;

import io.pulumi.awsnative.kendra.outputs.IndexJsonTokenTypeConfiguration;
import io.pulumi.awsnative.kendra.outputs.IndexJwtTokenTypeConfiguration;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class IndexUserTokenConfiguration {
    private final @Nullable IndexJsonTokenTypeConfiguration jsonTokenTypeConfiguration;
    private final @Nullable IndexJwtTokenTypeConfiguration jwtTokenTypeConfiguration;

    @OutputCustomType.Constructor
    private IndexUserTokenConfiguration(
        @OutputCustomType.Parameter("jsonTokenTypeConfiguration") @Nullable IndexJsonTokenTypeConfiguration jsonTokenTypeConfiguration,
        @OutputCustomType.Parameter("jwtTokenTypeConfiguration") @Nullable IndexJwtTokenTypeConfiguration jwtTokenTypeConfiguration) {
        this.jsonTokenTypeConfiguration = jsonTokenTypeConfiguration;
        this.jwtTokenTypeConfiguration = jwtTokenTypeConfiguration;
    }

    public Optional<IndexJsonTokenTypeConfiguration> getJsonTokenTypeConfiguration() {
        return Optional.ofNullable(this.jsonTokenTypeConfiguration);
    }
    public Optional<IndexJwtTokenTypeConfiguration> getJwtTokenTypeConfiguration() {
        return Optional.ofNullable(this.jwtTokenTypeConfiguration);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IndexUserTokenConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable IndexJsonTokenTypeConfiguration jsonTokenTypeConfiguration;
        private @Nullable IndexJwtTokenTypeConfiguration jwtTokenTypeConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(IndexUserTokenConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.jsonTokenTypeConfiguration = defaults.jsonTokenTypeConfiguration;
    	      this.jwtTokenTypeConfiguration = defaults.jwtTokenTypeConfiguration;
        }

        public Builder setJsonTokenTypeConfiguration(@Nullable IndexJsonTokenTypeConfiguration jsonTokenTypeConfiguration) {
            this.jsonTokenTypeConfiguration = jsonTokenTypeConfiguration;
            return this;
        }

        public Builder setJwtTokenTypeConfiguration(@Nullable IndexJwtTokenTypeConfiguration jwtTokenTypeConfiguration) {
            this.jwtTokenTypeConfiguration = jwtTokenTypeConfiguration;
            return this;
        }
        public IndexUserTokenConfiguration build() {
            return new IndexUserTokenConfiguration(jsonTokenTypeConfiguration, jwtTokenTypeConfiguration);
        }
    }
}
