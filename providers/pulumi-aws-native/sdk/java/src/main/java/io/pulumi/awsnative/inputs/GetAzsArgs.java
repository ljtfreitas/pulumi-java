// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAzsArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetAzsArgs Empty = new GetAzsArgs();

    @Import(name="region")
      private final @Nullable String region;

    public Optional<String> getRegion() {
        return this.region == null ? Optional.empty() : Optional.ofNullable(this.region);
    }

    public GetAzsArgs(@Nullable String region) {
        this.region = region;
    }

    private GetAzsArgs() {
        this.region = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAzsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String region;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAzsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.region = defaults.region;
        }

        public Builder region(@Nullable String region) {
            this.region = region;
            return this;
        }
        public GetAzsArgs build() {
            return new GetAzsArgs(region);
        }
    }
}
