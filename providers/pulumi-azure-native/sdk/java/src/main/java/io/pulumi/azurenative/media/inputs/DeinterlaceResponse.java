// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes the de-interlacing settings.
 * 
 */
public final class DeinterlaceResponse extends io.pulumi.resources.InvokeArgs {

    public static final DeinterlaceResponse Empty = new DeinterlaceResponse();

    /**
     * The deinterlacing mode. Defaults to AutoPixelAdaptive.
     * 
     */
    @Import(name="mode")
      private final @Nullable String mode;

    public Optional<String> getMode() {
        return this.mode == null ? Optional.empty() : Optional.ofNullable(this.mode);
    }

    /**
     * The field parity for de-interlacing, defaults to Auto.
     * 
     */
    @Import(name="parity")
      private final @Nullable String parity;

    public Optional<String> getParity() {
        return this.parity == null ? Optional.empty() : Optional.ofNullable(this.parity);
    }

    public DeinterlaceResponse(
        @Nullable String mode,
        @Nullable String parity) {
        this.mode = mode;
        this.parity = parity;
    }

    private DeinterlaceResponse() {
        this.mode = null;
        this.parity = null;
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

        public Builder mode(@Nullable String mode) {
            this.mode = mode;
            return this;
        }

        public Builder parity(@Nullable String parity) {
            this.parity = parity;
            return this;
        }
        public DeinterlaceResponse build() {
            return new DeinterlaceResponse(mode, parity);
        }
    }
}
