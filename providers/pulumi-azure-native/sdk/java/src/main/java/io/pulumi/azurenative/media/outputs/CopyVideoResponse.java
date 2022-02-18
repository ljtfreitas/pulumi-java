// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class CopyVideoResponse {
    /**
     * An optional label for the codec. The label can be used to control muxing behavior.
     * 
     */
    private final @Nullable String label;
    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.CopyVideo'.
     * 
     */
    private final String odataType;

    @OutputCustomType.Constructor({"label","odataType"})
    private CopyVideoResponse(
        @Nullable String label,
        String odataType) {
        this.label = label;
        this.odataType = Objects.requireNonNull(odataType);
    }

    /**
     * An optional label for the codec. The label can be used to control muxing behavior.
     * 
     */
    public Optional<String> getLabel() {
        return Optional.ofNullable(this.label);
    }
    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.CopyVideo'.
     * 
     */
    public String getOdataType() {
        return this.odataType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CopyVideoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String label;
        private String odataType;

        public Builder() {
    	      // Empty
        }

        public Builder(CopyVideoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.label = defaults.label;
    	      this.odataType = defaults.odataType;
        }

        public Builder setLabel(@Nullable String label) {
            this.label = label;
            return this;
        }

        public Builder setOdataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public CopyVideoResponse build() {
            return new CopyVideoResponse(label, odataType);
        }
    }
}
