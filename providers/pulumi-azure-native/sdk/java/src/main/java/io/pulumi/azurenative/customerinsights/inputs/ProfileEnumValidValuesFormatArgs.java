// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Valid enum values in case of an enum property.
 * 
 */
public final class ProfileEnumValidValuesFormatArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProfileEnumValidValuesFormatArgs Empty = new ProfileEnumValidValuesFormatArgs();

    /**
     * Localized names of the enum member.
     * 
     */
    @InputImport(name="localizedValueNames")
    private final @Nullable Input<Map<String,String>> localizedValueNames;

    public Input<Map<String,String>> getLocalizedValueNames() {
        return this.localizedValueNames == null ? Input.empty() : this.localizedValueNames;
    }

    /**
     * The integer value of the enum member.
     * 
     */
    @InputImport(name="value")
    private final @Nullable Input<Integer> value;

    public Input<Integer> getValue() {
        return this.value == null ? Input.empty() : this.value;
    }

    public ProfileEnumValidValuesFormatArgs(
        @Nullable Input<Map<String,String>> localizedValueNames,
        @Nullable Input<Integer> value) {
        this.localizedValueNames = localizedValueNames;
        this.value = value;
    }

    private ProfileEnumValidValuesFormatArgs() {
        this.localizedValueNames = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProfileEnumValidValuesFormatArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Map<String,String>> localizedValueNames;
        private @Nullable Input<Integer> value;

        public Builder() {
    	      // Empty
        }

        public Builder(ProfileEnumValidValuesFormatArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.localizedValueNames = defaults.localizedValueNames;
    	      this.value = defaults.value;
        }

        public Builder setLocalizedValueNames(@Nullable Input<Map<String,String>> localizedValueNames) {
            this.localizedValueNames = localizedValueNames;
            return this;
        }

        public Builder setLocalizedValueNames(@Nullable Map<String,String> localizedValueNames) {
            this.localizedValueNames = Input.ofNullable(localizedValueNames);
            return this;
        }

        public Builder setValue(@Nullable Input<Integer> value) {
            this.value = value;
            return this;
        }

        public Builder setValue(@Nullable Integer value) {
            this.value = Input.ofNullable(value);
            return this;
        }

        public ProfileEnumValidValuesFormatArgs build() {
            return new ProfileEnumValidValuesFormatArgs(localizedValueNames, value);
        }
    }
}
