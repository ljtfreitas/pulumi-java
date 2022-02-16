// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.customerprofiles.inputs;

import io.pulumi.awsnative.customerprofiles.enums.ObjectTypeKeyStandardIdentifiersItem;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ObjectTypeKeyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ObjectTypeKeyArgs Empty = new ObjectTypeKeyArgs();

    @InputImport(name="fieldNames")
    private final @Nullable Input<List<String>> fieldNames;

    public Input<List<String>> getFieldNames() {
        return this.fieldNames == null ? Input.empty() : this.fieldNames;
    }

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