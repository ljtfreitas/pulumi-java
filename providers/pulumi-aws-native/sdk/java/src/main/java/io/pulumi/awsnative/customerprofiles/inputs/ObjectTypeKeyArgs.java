// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.customerprofiles.inputs;

import io.pulumi.awsnative.customerprofiles.enums.ObjectTypeKeyStandardIdentifiersItem;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An object that defines the Key element of a ProfileObject. A Key is a special element that can be used to search for a customer profile.
 * 
 */
public final class ObjectTypeKeyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ObjectTypeKeyArgs Empty = new ObjectTypeKeyArgs();

    /**
     * The reference for the key name of the fields map.
     * 
     */
    @InputImport(name="fieldNames")
        private final @Nullable Input<List<String>> fieldNames;

    public Input<List<String>> getFieldNames() {
        return this.fieldNames == null ? Input.empty() : this.fieldNames;
    }

    /**
     * The types of keys that a ProfileObject can have. Each ProfileObject can have only 1 UNIQUE key but multiple PROFILE keys. PROFILE means that this key can be used to tie an object to a PROFILE. UNIQUE means that it can be used to uniquely identify an object. If a key a is marked as SECONDARY, it will be used to search for profiles after all other PROFILE keys have been searched. A LOOKUP_ONLY key is only used to match a profile but is not persisted to be used for searching of the profile. A NEW_ONLY key is only used if the profile does not already exist before the object is ingested, otherwise it is only used for matching objects to profiles.
     * 
     */
    @InputImport(name="standardIdentifiers")
        private final @Nullable Input<List<ObjectTypeKeyStandardIdentifiersItem>> standardIdentifiers;

    public Input<List<ObjectTypeKeyStandardIdentifiersItem>> getStandardIdentifiers() {
        return this.standardIdentifiers == null ? Input.empty() : this.standardIdentifiers;
    }

    public ObjectTypeKeyArgs(
        @Nullable Input<List<String>> fieldNames,
        @Nullable Input<List<ObjectTypeKeyStandardIdentifiersItem>> standardIdentifiers) {
        this.fieldNames = fieldNames;
        this.standardIdentifiers = standardIdentifiers;
    }

    private ObjectTypeKeyArgs() {
        this.fieldNames = Input.empty();
        this.standardIdentifiers = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ObjectTypeKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> fieldNames;
        private @Nullable Input<List<ObjectTypeKeyStandardIdentifiersItem>> standardIdentifiers;

        public Builder() {
    	      // Empty
        }

        public Builder(ObjectTypeKeyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fieldNames = defaults.fieldNames;
    	      this.standardIdentifiers = defaults.standardIdentifiers;
        }

        public Builder setFieldNames(@Nullable Input<List<String>> fieldNames) {
            this.fieldNames = fieldNames;
            return this;
        }

        public Builder setFieldNames(@Nullable List<String> fieldNames) {
            this.fieldNames = Input.ofNullable(fieldNames);
            return this;
        }

        public Builder setStandardIdentifiers(@Nullable Input<List<ObjectTypeKeyStandardIdentifiersItem>> standardIdentifiers) {
            this.standardIdentifiers = standardIdentifiers;
            return this;
        }

        public Builder setStandardIdentifiers(@Nullable List<ObjectTypeKeyStandardIdentifiersItem> standardIdentifiers) {
            this.standardIdentifiers = Input.ofNullable(standardIdentifiers);
            return this;
        }
        public ObjectTypeKeyArgs build() {
            return new ObjectTypeKeyArgs(fieldNames, standardIdentifiers);
        }
    }
}
