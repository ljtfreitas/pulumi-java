// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow.v3beta1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Required. Indicates whether the additional data should override or supplement the custom entity type definition.
     * 
     */
    @EnumType
    public enum SessionEntityTypeEntityOverrideMode {
        /**
         * Not specified. This value should be never used.
         * 
         */
        EntityOverrideModeUnspecified("ENTITY_OVERRIDE_MODE_UNSPECIFIED"),
        /**
         * The collection of session entities overrides the collection of entities in the corresponding custom entity type.
         * 
         */
        EntityOverrideModeOverride("ENTITY_OVERRIDE_MODE_OVERRIDE"),
        /**
         * The collection of session entities extends the collection of entities in the corresponding custom entity type. Note: Even in this override mode calls to `ListSessionEntityTypes`, `GetSessionEntityType`, `CreateSessionEntityType` and `UpdateSessionEntityType` only return the additional entities added in this session entity type. If you want to get the supplemented list, please call EntityTypes.GetEntityType on the custom entity type and merge.
         * 
         */
        EntityOverrideModeSupplement("ENTITY_OVERRIDE_MODE_SUPPLEMENT");

        private final String value;

        SessionEntityTypeEntityOverrideMode(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "SessionEntityTypeEntityOverrideMode[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
