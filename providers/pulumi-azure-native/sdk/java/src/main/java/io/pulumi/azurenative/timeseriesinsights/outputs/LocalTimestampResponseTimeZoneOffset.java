// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.timeseriesinsights.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LocalTimestampResponseTimeZoneOffset {
    /**
     * The event property that will be contain the offset information to calculate the local timestamp. When the LocalTimestampFormat is Iana, the property name will contain the name of the column which contains IANA Timezone Name (eg: Americas/Los Angeles). When LocalTimestampFormat is Timespan, it contains the name of property which contains values representing the offset (eg: P1D or 1.00:00:00)
     * 
     */
    private final @Nullable String propertyName;

    @CustomType.Constructor
    private LocalTimestampResponseTimeZoneOffset(@CustomType.Parameter("propertyName") @Nullable String propertyName) {
        this.propertyName = propertyName;
    }

    /**
     * The event property that will be contain the offset information to calculate the local timestamp. When the LocalTimestampFormat is Iana, the property name will contain the name of the column which contains IANA Timezone Name (eg: Americas/Los Angeles). When LocalTimestampFormat is Timespan, it contains the name of property which contains values representing the offset (eg: P1D or 1.00:00:00)
     * 
    */
    public Optional<String> getPropertyName() {
        return Optional.ofNullable(this.propertyName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LocalTimestampResponseTimeZoneOffset defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String propertyName;

        public Builder() {
    	      // Empty
        }

        public Builder(LocalTimestampResponseTimeZoneOffset defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.propertyName = defaults.propertyName;
        }

        public Builder propertyName(@Nullable String propertyName) {
            this.propertyName = propertyName;
            return this;
        }
        public LocalTimestampResponseTimeZoneOffset build() {
            return new LocalTimestampResponseTimeZoneOffset(propertyName);
        }
    }
}
