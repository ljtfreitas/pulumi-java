// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * HTTP Live Streaming (HLS) packing setting for the live output.
 * 
 */
public final class HlsResponse extends io.pulumi.resources.InvokeArgs {

    public static final HlsResponse Empty = new HlsResponse();

    /**
     * The number of fragments in an HTTP Live Streaming (HLS) TS segment in the output of the live event. This value does not affect the packing ratio for HLS CMAF output.
     * 
     */
    @InputImport(name="fragmentsPerTsSegment")
        private final @Nullable Integer fragmentsPerTsSegment;

    public Optional<Integer> getFragmentsPerTsSegment() {
        return this.fragmentsPerTsSegment == null ? Optional.empty() : Optional.ofNullable(this.fragmentsPerTsSegment);
    }

    public HlsResponse(@Nullable Integer fragmentsPerTsSegment) {
        this.fragmentsPerTsSegment = fragmentsPerTsSegment;
    }

    private HlsResponse() {
        this.fragmentsPerTsSegment = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HlsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer fragmentsPerTsSegment;

        public Builder() {
    	      // Empty
        }

        public Builder(HlsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fragmentsPerTsSegment = defaults.fragmentsPerTsSegment;
        }

        public Builder setFragmentsPerTsSegment(@Nullable Integer fragmentsPerTsSegment) {
            this.fragmentsPerTsSegment = fragmentsPerTsSegment;
            return this;
        }
        public HlsResponse build() {
            return new HlsResponse(fragmentsPerTsSegment);
        }
    }
}
