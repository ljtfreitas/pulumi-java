// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.portal.outputs;

import io.pulumi.azurenative.portal.outputs.DashboardPartsResponsePosition;
import io.pulumi.azurenative.portal.outputs.MarkdownPartMetadataResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DashboardPartsResponse {
    /**
     * The dashboard part's metadata.
     * 
     */
    private final @Nullable MarkdownPartMetadataResponse metadata;
    /**
     * The dashboard's part position.
     * 
     */
    private final DashboardPartsResponsePosition position;

    @OutputCustomType.Constructor({"metadata","position"})
    private DashboardPartsResponse(
        @Nullable MarkdownPartMetadataResponse metadata,
        DashboardPartsResponsePosition position) {
        this.metadata = metadata;
        this.position = Objects.requireNonNull(position);
    }

    /**
     * The dashboard part's metadata.
     * 
     */
    public Optional<MarkdownPartMetadataResponse> getMetadata() {
        return Optional.ofNullable(this.metadata);
    }
    /**
     * The dashboard's part position.
     * 
     */
    public DashboardPartsResponsePosition getPosition() {
        return this.position;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardPartsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable MarkdownPartMetadataResponse metadata;
        private DashboardPartsResponsePosition position;

        public Builder() {
    	      // Empty
        }

        public Builder(DashboardPartsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metadata = defaults.metadata;
    	      this.position = defaults.position;
        }

        public Builder setMetadata(@Nullable MarkdownPartMetadataResponse metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder setPosition(DashboardPartsResponsePosition position) {
            this.position = Objects.requireNonNull(position);
            return this;
        }

        public DashboardPartsResponse build() {
            return new DashboardPartsResponse(metadata, position);
        }
    }
}
