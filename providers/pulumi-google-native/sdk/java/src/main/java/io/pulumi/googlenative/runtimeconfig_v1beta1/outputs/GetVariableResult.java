// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.runtimeconfig_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetVariableResult {
    /**
     * The name of the variable resource, in the format: projects/[PROJECT_ID]/configs/[CONFIG_NAME]/variables/[VARIABLE_NAME] The `[PROJECT_ID]` must be a valid project ID, `[CONFIG_NAME]` must be a valid RuntimeConfig resource and `[VARIABLE_NAME]` follows Unix file system file path naming. The `[VARIABLE_NAME]` can contain ASCII letters, numbers, slashes and dashes. Slashes are used as path element separators and are not part of the `[VARIABLE_NAME]` itself, so `[VARIABLE_NAME]` must contain at least one non-slash character. Multiple slashes are coalesced into single slash character. Each path segment should match [0-9A-Za-z](?:[_.A-Za-z0-9-]{0,62}[_.A-Za-z0-9])? regular expression. The length of a `[VARIABLE_NAME]` must be less than 256 characters. Once you create a variable, you cannot change the variable name.
     * 
     */
    private final String name;
    /**
     * The current state of the variable. The variable state indicates the outcome of the `variables().watch` call and is visible through the `get` and `list` calls.
     * 
     */
    private final String state;
    /**
     * The string value of the variable. The length of the value must be less than 4096 bytes. Empty values are also accepted. For example, `text: "my text value"`. The string must be valid UTF-8.
     * 
     */
    private final String text;
    /**
     * The time of the last variable update. Timestamp will be UTC timestamp.
     * 
     */
    private final String updateTime;
    /**
     * The binary value of the variable. The length of the value must be less than 4096 bytes. Empty values are also accepted. The value must be base64 encoded, and must comply with IETF RFC4648 (https://www.ietf.org/rfc/rfc4648.txt). Only one of `value` or `text` can be set.
     * 
     */
    private final String value;

    @OutputCustomType.Constructor({"name","state","text","updateTime","value"})
    private GetVariableResult(
        String name,
        String state,
        String text,
        String updateTime,
        String value) {
        this.name = Objects.requireNonNull(name);
        this.state = Objects.requireNonNull(state);
        this.text = Objects.requireNonNull(text);
        this.updateTime = Objects.requireNonNull(updateTime);
        this.value = Objects.requireNonNull(value);
    }

    /**
     * The name of the variable resource, in the format: projects/[PROJECT_ID]/configs/[CONFIG_NAME]/variables/[VARIABLE_NAME] The `[PROJECT_ID]` must be a valid project ID, `[CONFIG_NAME]` must be a valid RuntimeConfig resource and `[VARIABLE_NAME]` follows Unix file system file path naming. The `[VARIABLE_NAME]` can contain ASCII letters, numbers, slashes and dashes. Slashes are used as path element separators and are not part of the `[VARIABLE_NAME]` itself, so `[VARIABLE_NAME]` must contain at least one non-slash character. Multiple slashes are coalesced into single slash character. Each path segment should match [0-9A-Za-z](?:[_.A-Za-z0-9-]{0,62}[_.A-Za-z0-9])? regular expression. The length of a `[VARIABLE_NAME]` must be less than 256 characters. Once you create a variable, you cannot change the variable name.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The current state of the variable. The variable state indicates the outcome of the `variables().watch` call and is visible through the `get` and `list` calls.
     * 
     */
    public String getState() {
        return this.state;
    }
    /**
     * The string value of the variable. The length of the value must be less than 4096 bytes. Empty values are also accepted. For example, `text: "my text value"`. The string must be valid UTF-8.
     * 
     */
    public String getText() {
        return this.text;
    }
    /**
     * The time of the last variable update. Timestamp will be UTC timestamp.
     * 
     */
    public String getUpdateTime() {
        return this.updateTime;
    }
    /**
     * The binary value of the variable. The length of the value must be less than 4096 bytes. Empty values are also accepted. The value must be base64 encoded, and must comply with IETF RFC4648 (https://www.ietf.org/rfc/rfc4648.txt). Only one of `value` or `text` can be set.
     * 
     */
    public String getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVariableResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String state;
        private String text;
        private String updateTime;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVariableResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.state = defaults.state;
    	      this.text = defaults.text;
    	      this.updateTime = defaults.updateTime;
    	      this.value = defaults.value;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder setText(String text) {
            this.text = Objects.requireNonNull(text);
            return this;
        }

        public Builder setUpdateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }

        public Builder setValue(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public GetVariableResult build() {
            return new GetVariableResult(name, state, text, updateTime, value);
        }
    }
}
