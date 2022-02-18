// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.azurenative.insights.inputs.AlertRuleLeafConditionArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An Activity Log Alert rule condition that is met when all its member conditions are met.
 * Each condition can be of one of the following types:
 * __Important__: Each type has its unique subset of properties. Properties from different types CANNOT exist in one condition.
 *    * __Leaf Condition -__ must contain 'field' and either 'equals' or 'containsAny'.
 *        _Please note, 'anyOf' should __not__ be set in a Leaf Condition._
 *   * __AnyOf Condition -__ must contain __only__ 'anyOf' (which is an array of Leaf Conditions).
 *       _Please note, 'field', 'equals' and 'containsAny' should __not__ be set in an AnyOf Condition._
 * 
 */
public final class AlertRuleAnyOfOrLeafConditionArgs extends io.pulumi.resources.ResourceArgs {

    public static final AlertRuleAnyOfOrLeafConditionArgs Empty = new AlertRuleAnyOfOrLeafConditionArgs();

    /**
     * An Activity Log Alert rule condition that is met when at least one of its member leaf conditions are met.
     * 
     */
    @InputImport(name="anyOf")
    private final @Nullable Input<List<AlertRuleLeafConditionArgs>> anyOf;

    public Input<List<AlertRuleLeafConditionArgs>> getAnyOf() {
        return this.anyOf == null ? Input.empty() : this.anyOf;
    }

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

    public AlertRuleAnyOfOrLeafConditionArgs(
        @Nullable Input<List<AlertRuleLeafConditionArgs>> anyOf,
        @Nullable Input<List<String>> containsAny,
        @Nullable Input<String> equals,
        @Nullable Input<String> field) {
        this.anyOf = anyOf;
        this.containsAny = containsAny;
        this.equals = equals;
        this.field = field;
    }

    private AlertRuleAnyOfOrLeafConditionArgs() {
        this.anyOf = Input.empty();
        this.containsAny = Input.empty();
        this.equals = Input.empty();
        this.field = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlertRuleAnyOfOrLeafConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<AlertRuleLeafConditionArgs>> anyOf;
        private @Nullable Input<List<String>> containsAny;
        private @Nullable Input<String> equals;
        private @Nullable Input<String> field;

        public Builder() {
    	      // Empty
        }

        public Builder(AlertRuleAnyOfOrLeafConditionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.anyOf = defaults.anyOf;
    	      this.containsAny = defaults.containsAny;
    	      this.equals = defaults.equals;
    	      this.field = defaults.field;
        }

        public Builder setAnyOf(@Nullable Input<List<AlertRuleLeafConditionArgs>> anyOf) {
            this.anyOf = anyOf;
            return this;
        }

        public Builder setAnyOf(@Nullable List<AlertRuleLeafConditionArgs> anyOf) {
            this.anyOf = Input.ofNullable(anyOf);
            return this;
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

        public AlertRuleAnyOfOrLeafConditionArgs build() {
            return new AlertRuleAnyOfOrLeafConditionArgs(anyOf, containsAny, equals, field);
        }
    }
}
