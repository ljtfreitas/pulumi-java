// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.dialogflow_v3beta1.inputs.GoogleCloudDialogflowCxV3beta1FormParameterFillBehaviorArgs;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GoogleCloudDialogflowCxV3beta1FormParameterArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowCxV3beta1FormParameterArgs Empty = new GoogleCloudDialogflowCxV3beta1FormParameterArgs();

    @InputImport(name="defaultValue")
    private final @Nullable Input<Object> defaultValue;

    public Input<Object> getDefaultValue() {
        return this.defaultValue == null ? Input.empty() : this.defaultValue;
    }

    @InputImport(name="displayName", required=true)
    private final Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName;
    }

    @InputImport(name="entityType", required=true)
    private final Input<String> entityType;

    public Input<String> getEntityType() {
        return this.entityType;
    }

    @InputImport(name="fillBehavior", required=true)
    private final Input<GoogleCloudDialogflowCxV3beta1FormParameterFillBehaviorArgs> fillBehavior;

    public Input<GoogleCloudDialogflowCxV3beta1FormParameterFillBehaviorArgs> getFillBehavior() {
        return this.fillBehavior;
    }

    @InputImport(name="isList")
    private final @Nullable Input<Boolean> isList;

    public Input<Boolean> getIsList() {
        return this.isList == null ? Input.empty() : this.isList;
    }

    @InputImport(name="redact")
    private final @Nullable Input<Boolean> redact;

    public Input<Boolean> getRedact() {
        return this.redact == null ? Input.empty() : this.redact;
    }

    @InputImport(name="required")
    private final @Nullable Input<Boolean> required;

    public Input<Boolean> getRequired() {
        return this.required == null ? Input.empty() : this.required;
    }

    public GoogleCloudDialogflowCxV3beta1FormParameterArgs(
        @Nullable Input<Object> defaultValue,
        Input<String> displayName,
        Input<String> entityType,
        Input<GoogleCloudDialogflowCxV3beta1FormParameterFillBehaviorArgs> fillBehavior,
        @Nullable Input<Boolean> isList,
        @Nullable Input<Boolean> redact,
        @Nullable Input<Boolean> required) {
        this.defaultValue = defaultValue;
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.entityType = Objects.requireNonNull(entityType, "expected parameter 'entityType' to be non-null");
        this.fillBehavior = Objects.requireNonNull(fillBehavior, "expected parameter 'fillBehavior' to be non-null");
        this.isList = isList;
        this.redact = redact;
        this.required = required;
    }

    private GoogleCloudDialogflowCxV3beta1FormParameterArgs() {
        this.defaultValue = Input.empty();
        this.displayName = Input.empty();
        this.entityType = Input.empty();
        this.fillBehavior = Input.empty();
        this.isList = Input.empty();
        this.redact = Input.empty();
        this.required = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3beta1FormParameterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Object> defaultValue;
        private Input<String> displayName;
        private Input<String> entityType;
        private Input<GoogleCloudDialogflowCxV3beta1FormParameterFillBehaviorArgs> fillBehavior;
        private @Nullable Input<Boolean> isList;
        private @Nullable Input<Boolean> redact;
        private @Nullable Input<Boolean> required;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3beta1FormParameterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultValue = defaults.defaultValue;
    	      this.displayName = defaults.displayName;
    	      this.entityType = defaults.entityType;
    	      this.fillBehavior = defaults.fillBehavior;
    	      this.isList = defaults.isList;
    	      this.redact = defaults.redact;
    	      this.required = defaults.required;
        }

        public Builder setDefaultValue(@Nullable Input<Object> defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }

        public Builder setDefaultValue(@Nullable Object defaultValue) {
            this.defaultValue = Input.ofNullable(defaultValue);
            return this;
        }

        public Builder setDisplayName(Input<String> displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Input.of(Objects.requireNonNull(displayName));
            return this;
        }

        public Builder setEntityType(Input<String> entityType) {
            this.entityType = Objects.requireNonNull(entityType);
            return this;
        }

        public Builder setEntityType(String entityType) {
            this.entityType = Input.of(Objects.requireNonNull(entityType));
            return this;
        }

        public Builder setFillBehavior(Input<GoogleCloudDialogflowCxV3beta1FormParameterFillBehaviorArgs> fillBehavior) {
            this.fillBehavior = Objects.requireNonNull(fillBehavior);
            return this;
        }

        public Builder setFillBehavior(GoogleCloudDialogflowCxV3beta1FormParameterFillBehaviorArgs fillBehavior) {
            this.fillBehavior = Input.of(Objects.requireNonNull(fillBehavior));
            return this;
        }

        public Builder setIsList(@Nullable Input<Boolean> isList) {
            this.isList = isList;
            return this;
        }

        public Builder setIsList(@Nullable Boolean isList) {
            this.isList = Input.ofNullable(isList);
            return this;
        }

        public Builder setRedact(@Nullable Input<Boolean> redact) {
            this.redact = redact;
            return this;
        }

        public Builder setRedact(@Nullable Boolean redact) {
            this.redact = Input.ofNullable(redact);
            return this;
        }

        public Builder setRequired(@Nullable Input<Boolean> required) {
            this.required = required;
            return this;
        }

        public Builder setRequired(@Nullable Boolean required) {
            this.required = Input.ofNullable(required);
            return this;
        }

        public GoogleCloudDialogflowCxV3beta1FormParameterArgs build() {
            return new GoogleCloudDialogflowCxV3beta1FormParameterArgs(defaultValue, displayName, entityType, fillBehavior, isList, redact, required);
        }
    }
}