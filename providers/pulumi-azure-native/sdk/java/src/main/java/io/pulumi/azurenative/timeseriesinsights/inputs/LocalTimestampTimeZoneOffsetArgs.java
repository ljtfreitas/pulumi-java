// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.timeseriesinsights.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An object that represents the offset information for the local timestamp format specified. Should not be specified for LocalTimestampFormat - Embedded.
 * 
 */
public final class LocalTimestampTimeZoneOffsetArgs extends io.pulumi.resources.ResourceArgs {

    public static final LocalTimestampTimeZoneOffsetArgs Empty = new LocalTimestampTimeZoneOffsetArgs();

    /**
     * The event property that will be contain the offset information to calculate the local timestamp. When the LocalTimestampFormat is Iana, the property name will contain the name of the column which contains IANA Timezone Name (eg: Americas/Los Angeles). When LocalTimestampFormat is Timespan, it contains the name of property which contains values representing the offset (eg: P1D or 1.00:00:00)
     * 
     */
    @InputImport(name="propertyName")
    private final @Nullable Input<String> propertyName;

    public Input<String> getPropertyName() {
        return this.propertyName == null ? Input.empty() : this.propertyName;
    }

    public LocalTimestampTimeZoneOffsetArgs(@Nullable Input<String> propertyName) {
        this.propertyName = propertyName;
    }

    private LocalTimestampTimeZoneOffsetArgs() {
        this.propertyName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LocalTimestampTimeZoneOffsetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> propertyName;

        public Builder() {
    	      // Empty
        }

        public Builder(LocalTimestampTimeZoneOffsetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.propertyName = defaults.propertyName;
        }

        public Builder setPropertyName(@Nullable Input<String> propertyName) {
            this.propertyName = propertyName;
            return this;
        }

        public Builder setPropertyName(@Nullable String propertyName) {
            this.propertyName = Input.ofNullable(propertyName);
            return this;
        }

        public LocalTimestampTimeZoneOffsetArgs build() {
            return new LocalTimestampTimeZoneOffsetArgs(propertyName);
        }
    }
}
