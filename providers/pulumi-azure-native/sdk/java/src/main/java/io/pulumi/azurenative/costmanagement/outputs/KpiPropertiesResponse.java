// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class KpiPropertiesResponse {
    /**
     * show the KPI in the UI?
     * 
     */
    private final @Nullable Boolean enabled;
    /**
     * ID of resource related to metric (budget).
     * 
     */
    private final @Nullable String id;
    /**
     * KPI type (Forecast, Budget).
     * 
     */
    private final @Nullable String type;

    @OutputCustomType.Constructor({"enabled","id","type"})
    private KpiPropertiesResponse(
        @Nullable Boolean enabled,
        @Nullable String id,
        @Nullable String type) {
        this.enabled = enabled;
        this.id = id;
        this.type = type;
    }

    /**
     * show the KPI in the UI?
     * 
     */
    public Optional<Boolean> getEnabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * ID of resource related to metric (budget).
     * 
     */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * KPI type (Forecast, Budget).
     * 
     */
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KpiPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable String id;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(KpiPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.id = defaults.id;
    	      this.type = defaults.type;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }

        public KpiPropertiesResponse build() {
            return new KpiPropertiesResponse(enabled, id, type);
        }
    }
}
