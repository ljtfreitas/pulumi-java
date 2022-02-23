// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.portal.inputs;

import io.pulumi.azurenative.portal.inputs.DashboardPartsResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A dashboard lens.
 * 
 */
public final class DashboardLensResponse extends io.pulumi.resources.InvokeArgs {

    public static final DashboardLensResponse Empty = new DashboardLensResponse();

    /**
     * The dashboard len's metadata.
     * 
     */
    @InputImport(name="metadata")
        private final @Nullable Map<String,Object> metadata;

    public Map<String,Object> getMetadata() {
        return this.metadata == null ? Map.of() : this.metadata;
    }

    /**
     * The lens order.
     * 
     */
    @InputImport(name="order", required=true)
        private final Integer order;

    public Integer getOrder() {
        return this.order;
    }

    /**
     * The dashboard parts.
     * 
     */
    @InputImport(name="parts", required=true)
        private final List<DashboardPartsResponse> parts;

    public List<DashboardPartsResponse> getParts() {
        return this.parts;
    }

    public DashboardLensResponse(
        @Nullable Map<String,Object> metadata,
        Integer order,
        List<DashboardPartsResponse> parts) {
        this.metadata = metadata;
        this.order = Objects.requireNonNull(order, "expected parameter 'order' to be non-null");
        this.parts = Objects.requireNonNull(parts, "expected parameter 'parts' to be non-null");
    }

    private DashboardLensResponse() {
        this.metadata = Map.of();
        this.order = null;
        this.parts = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardLensResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,Object> metadata;
        private Integer order;
        private List<DashboardPartsResponse> parts;

        public Builder() {
    	      // Empty
        }

        public Builder(DashboardLensResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metadata = defaults.metadata;
    	      this.order = defaults.order;
    	      this.parts = defaults.parts;
        }

        public Builder setMetadata(@Nullable Map<String,Object> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder setOrder(Integer order) {
            this.order = Objects.requireNonNull(order);
            return this;
        }

        public Builder setParts(List<DashboardPartsResponse> parts) {
            this.parts = Objects.requireNonNull(parts);
            return this;
        }
        public DashboardLensResponse build() {
            return new DashboardLensResponse(metadata, order, parts);
        }
    }
}
