// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kinesisfirehose.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Object;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DeliveryStreamOpenXJsonSerDeArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeliveryStreamOpenXJsonSerDeArgs Empty = new DeliveryStreamOpenXJsonSerDeArgs();

    @InputImport(name="caseInsensitive")
        private final @Nullable Input<Boolean> caseInsensitive;

    public Input<Boolean> getCaseInsensitive() {
        return this.caseInsensitive == null ? Input.empty() : this.caseInsensitive;
    }

    @InputImport(name="columnToJsonKeyMappings")
        private final @Nullable Input<Object> columnToJsonKeyMappings;

    public Input<Object> getColumnToJsonKeyMappings() {
        return this.columnToJsonKeyMappings == null ? Input.empty() : this.columnToJsonKeyMappings;
    }

    @InputImport(name="convertDotsInJsonKeysToUnderscores")
        private final @Nullable Input<Boolean> convertDotsInJsonKeysToUnderscores;

    public Input<Boolean> getConvertDotsInJsonKeysToUnderscores() {
        return this.convertDotsInJsonKeysToUnderscores == null ? Input.empty() : this.convertDotsInJsonKeysToUnderscores;
    }

    public DeliveryStreamOpenXJsonSerDeArgs(
        @Nullable Input<Boolean> caseInsensitive,
        @Nullable Input<Object> columnToJsonKeyMappings,
        @Nullable Input<Boolean> convertDotsInJsonKeysToUnderscores) {
        this.caseInsensitive = caseInsensitive;
        this.columnToJsonKeyMappings = columnToJsonKeyMappings;
        this.convertDotsInJsonKeysToUnderscores = convertDotsInJsonKeysToUnderscores;
    }

    private DeliveryStreamOpenXJsonSerDeArgs() {
        this.caseInsensitive = Input.empty();
        this.columnToJsonKeyMappings = Input.empty();
        this.convertDotsInJsonKeysToUnderscores = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryStreamOpenXJsonSerDeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> caseInsensitive;
        private @Nullable Input<Object> columnToJsonKeyMappings;
        private @Nullable Input<Boolean> convertDotsInJsonKeysToUnderscores;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryStreamOpenXJsonSerDeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.caseInsensitive = defaults.caseInsensitive;
    	      this.columnToJsonKeyMappings = defaults.columnToJsonKeyMappings;
    	      this.convertDotsInJsonKeysToUnderscores = defaults.convertDotsInJsonKeysToUnderscores;
        }

        public Builder setCaseInsensitive(@Nullable Input<Boolean> caseInsensitive) {
            this.caseInsensitive = caseInsensitive;
            return this;
        }

        public Builder setCaseInsensitive(@Nullable Boolean caseInsensitive) {
            this.caseInsensitive = Input.ofNullable(caseInsensitive);
            return this;
        }

        public Builder setColumnToJsonKeyMappings(@Nullable Input<Object> columnToJsonKeyMappings) {
            this.columnToJsonKeyMappings = columnToJsonKeyMappings;
            return this;
        }

        public Builder setColumnToJsonKeyMappings(@Nullable Object columnToJsonKeyMappings) {
            this.columnToJsonKeyMappings = Input.ofNullable(columnToJsonKeyMappings);
            return this;
        }

        public Builder setConvertDotsInJsonKeysToUnderscores(@Nullable Input<Boolean> convertDotsInJsonKeysToUnderscores) {
            this.convertDotsInJsonKeysToUnderscores = convertDotsInJsonKeysToUnderscores;
            return this;
        }

        public Builder setConvertDotsInJsonKeysToUnderscores(@Nullable Boolean convertDotsInJsonKeysToUnderscores) {
            this.convertDotsInJsonKeysToUnderscores = Input.ofNullable(convertDotsInJsonKeysToUnderscores);
            return this;
        }
        public DeliveryStreamOpenXJsonSerDeArgs build() {
            return new DeliveryStreamOpenXJsonSerDeArgs(caseInsensitive, columnToJsonKeyMappings, convertDotsInJsonKeysToUnderscores);
        }
    }
}
