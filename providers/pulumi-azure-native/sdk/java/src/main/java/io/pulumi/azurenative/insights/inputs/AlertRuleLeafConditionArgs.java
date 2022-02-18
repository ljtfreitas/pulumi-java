// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An Activity Log Alert rule condition that is met by comparing the field and value of an Activity Log event.
 * This condition must contain 'field' and either 'equals' or 'containsAny'.
 * 
 */
public final class AlertRuleLeafConditionArgs extends io.pulumi.resources.ResourceArgs {

    public static final AlertRuleLeafConditionArgs Empty = new AlertRuleLeafConditionArgs();

    /**
     * The value of the event's field will be compared to the values in this array (case-insensitive) to determine if the condition is met.
     * 
     */
    @InputImport(name="containsAny")
    private final @Nullable Input<List<String>> containsAny;

    public Input<List<String>> getContainsAny() {
        return this.containsAny == null ? Input.empty() : this.containsAny;
    }

    /**
     * The value of the event's field will be compared to this value (case-insensitive) to determine if the condition is met.
     * 
     */
    @InputImport(name="equals")
    private final @Nullable Input<String> equals;

    public Input<String> getEquals() {
        return this.equals == null ? Input.empty() : this.equals;
    }

    /**
     * The name of the Activity Log event's field that this condition will examine.
     * The possible values for this field are (case-insensitive): 'resourceId', 'category', 'caller', 'level', 'operationName', 'resourceGroup', 'resourceProvider', 'status', 'subStatus', 'resourceType', or anything beginning with 'properties'.
     * 
     */
    @InputImport(name="field")
    private final @Nullable Input<String> field;

    public Input<String> getField() {
        return this.field == null ? Input.empty() : this.field;
    }

    public AlertRuleLeafConditionArgs(
        @Nullable Input<List<String>> containsAny,
        @Nullable Input<String> equals,
        @Nullable Input<String> field) {
        this.containsAny = containsAny;
        this.equals = equals;
        this.field = field;
    }

    private AlertRuleLeafConditionArgs() {
        this.containsAny = Input.empty();
        this.equals = Input.empty();
        this.field = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlertRuleLeafConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> containsAny;
        private @Nullable Input<String> equals;
        private @Nullable Input<String> field;

        public Builder() {
    	      // Empty
        }

        public Builder(AlertRuleLeafConditionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containsAny = defaults.containsAny;
    	      this.equals = defaults.equals;
    	      this.field = defaults.field;
        }

        public Builder setContainsAny(@Nullable Input<List<String>> containsAny) {
            this.containsAny = containsAny;
            return this;
        }

        public Builder setContainsAny(@Nullable List<String> containsAny) {
            this.containsAny = Input.ofNullable(containsAny);
            return this;
        }

        public Builder setEquals(@Nullable Input<String> equals) {
            this.equals = equals;
            return this;
        }

        public Builder setEquals(@Nullable String equals) {
            this.equals = Input.ofNullable(equals);
            return this;
        }

        public Builder setField(@Nullable Input<String> field) {
            this.field = field;
            return this;
        }

        public Builder setField(@Nullable String field) {
            this.field = Input.ofNullable(field);
            return this;
        }

        public AlertRuleLeafConditionArgs build() {
            return new AlertRuleLeafConditionArgs(containsAny, equals, field);
        }
    }
}
