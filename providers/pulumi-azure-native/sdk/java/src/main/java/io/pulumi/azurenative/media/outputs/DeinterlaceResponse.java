// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DeinterlaceResponse {
    /**
     * The deinterlacing mode. Defaults to AutoPixelAdaptive.
     * 
     */
    private final @Nullable String mode;
    /**
     * The field parity for de-interlacing, defaults to Auto.
     * 
     */
    private final @Nullable String parity;

    @OutputCustomType.Constructor({"mode","parity"})
    private DeinterlaceResponse(
        @Nullable String mode,
        @Nullable String parity) {
        this.mode = mode;
        this.parity = parity;
    }

    /**
     * The deinterlacing mode. Defaults to AutoPixelAdaptive.
     * 
     */
    public Optional<String> getMode() {
        return Optional.ofNullable(this.mode);
    }
    /**
     * The field parity for de-interlacing, defaults to Auto.
     * 
     */
    public Optional<String> getParity() {
        return Optional.ofNullable(this.parity);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeinterlaceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String mode;
        private @Nullable String parity;

        public Builder() {
    	      // Empty
        }

        public Builder(DeinterlaceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mode = defaults.mode;
    	      this.parity = defaults.parity;
        }

        public Builder setMode(@Nullable String mode) {
            this.mode = mode;
            return this;
        }

        public Builder setParity(@Nullable String parity) {
            this.parity = parity;
            return this;
        }

        public DeinterlaceResponse build() {
            return new DeinterlaceResponse(mode, parity);
        }
    }
}
