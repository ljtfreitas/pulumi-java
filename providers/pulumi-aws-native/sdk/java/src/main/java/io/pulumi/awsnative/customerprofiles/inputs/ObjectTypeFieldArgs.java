// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.customerprofiles.inputs;

import io.pulumi.awsnative.customerprofiles.enums.ObjectTypeFieldContentType;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents a field in a ProfileObjectType.
 * 
 */
public final class ObjectTypeFieldArgs extends io.pulumi.resources.ResourceArgs {

    public static final ObjectTypeFieldArgs Empty = new ObjectTypeFieldArgs();

    /**
     * The content type of the field. Used for determining equality when searching.
     * 
     */
    @InputImport(name="contentType")
        private final @Nullable Input<ObjectTypeFieldContentType> contentType;

    public Input<ObjectTypeFieldContentType> getContentType() {
        return this.contentType == null ? Input.empty() : this.contentType;
    }

    /**
     * A field of a ProfileObject. For example: _source.FirstName, where "_source" is a ProfileObjectType of a Zendesk user and "FirstName" is a field in that ObjectType.
     * 
     */
    @InputImport(name="source")
        private final @Nullable Input<String> source;

    public Input<String> getSource() {
        return this.source == null ? Input.empty() : this.source;
    }

    /**
     * The location of the data in the standard ProfileObject model. For example: _profile.Address.PostalCode.
     * 
     */
    @InputImport(name="target")
        private final @Nullable Input<String> target;

    public Input<String> getTarget() {
        return this.target == null ? Input.empty() : this.target;
    }

    public ObjectTypeFieldArgs(
        @Nullable Input<ObjectTypeFieldContentType> contentType,
        @Nullable Input<String> source,
        @Nullable Input<String> target) {
        this.contentType = contentType;
        this.source = source;
        this.target = target;
    }

    private ObjectTypeFieldArgs() {
        this.contentType = Input.empty();
        this.source = Input.empty();
        this.target = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ObjectTypeFieldArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ObjectTypeFieldContentType> contentType;
        private @Nullable Input<String> source;
        private @Nullable Input<String> target;

        public Builder() {
    	      // Empty
        }

        public Builder(ObjectTypeFieldArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentType = defaults.contentType;
    	      this.source = defaults.source;
    	      this.target = defaults.target;
        }

        public Builder setContentType(@Nullable Input<ObjectTypeFieldContentType> contentType) {
            this.contentType = contentType;
            return this;
        }

        public Builder setContentType(@Nullable ObjectTypeFieldContentType contentType) {
            this.contentType = Input.ofNullable(contentType);
            return this;
        }

        public Builder setSource(@Nullable Input<String> source) {
            this.source = source;
            return this;
        }

        public Builder setSource(@Nullable String source) {
            this.source = Input.ofNullable(source);
            return this;
        }

        public Builder setTarget(@Nullable Input<String> target) {
            this.target = target;
            return this;
        }

        public Builder setTarget(@Nullable String target) {
            this.target = Input.ofNullable(target);
            return this;
        }
        public ObjectTypeFieldArgs build() {
            return new ObjectTypeFieldArgs(contentType, source, target);
        }
    }
}
