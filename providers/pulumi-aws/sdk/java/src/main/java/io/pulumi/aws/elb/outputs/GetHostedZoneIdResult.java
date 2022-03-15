// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elb.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetHostedZoneIdResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final @Nullable String region;

    @CustomType.Constructor
    private GetHostedZoneIdResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("region") @Nullable String region) {
        this.id = id;
        this.region = region;
    }

    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    public Optional<String> getRegion() {
        return Optional.ofNullable(this.region);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetHostedZoneIdResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private @Nullable String region;

        public Builder() {
    	      // Empty
        }

        public Builder(GetHostedZoneIdResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.region = defaults.region;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder region(@Nullable String region) {
            this.region = region;
            return this;
        }
        public GetHostedZoneIdResult build() {
            return new GetHostedZoneIdResult(id, region);
        }
    }
}
