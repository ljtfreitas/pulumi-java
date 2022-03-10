// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.robomaker.outputs;

import io.pulumi.awsnative.robomaker.outputs.FleetTags;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetFleetResult {
    private final @Nullable String arn;
    private final @Nullable FleetTags tags;

    @OutputCustomType.Constructor
    private GetFleetResult(
        @OutputCustomType.Parameter("arn") @Nullable String arn,
        @OutputCustomType.Parameter("tags") @Nullable FleetTags tags) {
        this.arn = arn;
        this.tags = tags;
    }

    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    public Optional<FleetTags> getTags() {
        return Optional.ofNullable(this.tags);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFleetResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable FleetTags tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFleetResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.tags = defaults.tags;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder setTags(@Nullable FleetTags tags) {
            this.tags = tags;
            return this;
        }
        public GetFleetResult build() {
            return new GetFleetResult(arn, tags);
        }
    }
}
