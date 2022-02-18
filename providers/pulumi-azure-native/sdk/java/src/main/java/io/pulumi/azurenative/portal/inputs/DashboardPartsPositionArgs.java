// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.portal.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The dashboard's part position.
 * 
 */
public final class DashboardPartsPositionArgs extends io.pulumi.resources.ResourceArgs {

    public static final DashboardPartsPositionArgs Empty = new DashboardPartsPositionArgs();

    /**
     * The dashboard's part column span.
     * 
     */
    @InputImport(name="colSpan", required=true)
    private final Input<Integer> colSpan;

    public Input<Integer> getColSpan() {
        return this.colSpan;
    }

    /**
     * The dashboard part's metadata.
     * 
     */
    @InputImport(name="metadata")
    private final @Nullable Input<Map<String,Object>> metadata;

    public Input<Map<String,Object>> getMetadata() {
        return this.metadata == null ? Input.empty() : this.metadata;
    }

    /**
     * The dashboard's part row span.
     * 
     */
    @InputImport(name="rowSpan", required=true)
    private final Input<Integer> rowSpan;

    public Input<Integer> getRowSpan() {
        return this.rowSpan;
    }

    /**
     * The dashboard's part x coordinate.
     * 
     */
    @InputImport(name="x", required=true)
    private final Input<Integer> x;

    public Input<Integer> getX() {
        return this.x;
    }

    /**
     * The dashboard's part y coordinate.
     * 
     */
    @InputImport(name="y", required=true)
    private final Input<Integer> y;

    public Input<Integer> getY() {
        return this.y;
    }

    public DashboardPartsPositionArgs(
        Input<Integer> colSpan,
        @Nullable Input<Map<String,Object>> metadata,
        Input<Integer> rowSpan,
        Input<Integer> x,
        Input<Integer> y) {
        this.colSpan = Objects.requireNonNull(colSpan, "expected parameter 'colSpan' to be non-null");
        this.metadata = metadata;
        this.rowSpan = Objects.requireNonNull(rowSpan, "expected parameter 'rowSpan' to be non-null");
        this.x = Objects.requireNonNull(x, "expected parameter 'x' to be non-null");
        this.y = Objects.requireNonNull(y, "expected parameter 'y' to be non-null");
    }

    private DashboardPartsPositionArgs() {
        this.colSpan = Input.empty();
        this.metadata = Input.empty();
        this.rowSpan = Input.empty();
        this.x = Input.empty();
        this.y = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardPartsPositionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Integer> colSpan;
        private @Nullable Input<Map<String,Object>> metadata;
        private Input<Integer> rowSpan;
        private Input<Integer> x;
        private Input<Integer> y;

        public Builder() {
    	      // Empty
        }

        public Builder(DashboardPartsPositionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.colSpan = defaults.colSpan;
    	      this.metadata = defaults.metadata;
    	      this.rowSpan = defaults.rowSpan;
    	      this.x = defaults.x;
    	      this.y = defaults.y;
        }

        public Builder setColSpan(Input<Integer> colSpan) {
            this.colSpan = Objects.requireNonNull(colSpan);
            return this;
        }

        public Builder setColSpan(Integer colSpan) {
            this.colSpan = Input.of(Objects.requireNonNull(colSpan));
            return this;
        }

        public Builder setMetadata(@Nullable Input<Map<String,Object>> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder setMetadata(@Nullable Map<String,Object> metadata) {
            this.metadata = Input.ofNullable(metadata);
            return this;
        }

        public Builder setRowSpan(Input<Integer> rowSpan) {
            this.rowSpan = Objects.requireNonNull(rowSpan);
            return this;
        }

        public Builder setRowSpan(Integer rowSpan) {
            this.rowSpan = Input.of(Objects.requireNonNull(rowSpan));
            return this;
        }

        public Builder setX(Input<Integer> x) {
            this.x = Objects.requireNonNull(x);
            return this;
        }

        public Builder setX(Integer x) {
            this.x = Input.of(Objects.requireNonNull(x));
            return this;
        }

        public Builder setY(Input<Integer> y) {
            this.y = Objects.requireNonNull(y);
            return this;
        }

        public Builder setY(Integer y) {
            this.y = Input.of(Objects.requireNonNull(y));
            return this;
        }

        public DashboardPartsPositionArgs build() {
            return new DashboardPartsPositionArgs(colSpan, metadata, rowSpan, x, y);
        }
    }
}
