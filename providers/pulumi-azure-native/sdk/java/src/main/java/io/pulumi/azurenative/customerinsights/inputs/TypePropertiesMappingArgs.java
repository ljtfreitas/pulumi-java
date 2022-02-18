// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights.inputs;

import io.pulumi.azurenative.customerinsights.enums.LinkTypes;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Metadata for a Link's property mapping.
 * 
 */
public final class TypePropertiesMappingArgs extends io.pulumi.resources.ResourceArgs {

    public static final TypePropertiesMappingArgs Empty = new TypePropertiesMappingArgs();

    /**
     * Link type.
     * 
     */
    @InputImport(name="linkType")
    private final @Nullable Input<LinkTypes> linkType;

    public Input<LinkTypes> getLinkType() {
        return this.linkType == null ? Input.empty() : this.linkType;
    }

    /**
     *  Property name on the source Entity Type.
     * 
     */
    @InputImport(name="sourcePropertyName", required=true)
    private final Input<String> sourcePropertyName;

    public Input<String> getSourcePropertyName() {
        return this.sourcePropertyName;
    }

    /**
     * Property name on the target Entity Type.
     * 
     */
    @InputImport(name="targetPropertyName", required=true)
    private final Input<String> targetPropertyName;

    public Input<String> getTargetPropertyName() {
        return this.targetPropertyName;
    }

    public TypePropertiesMappingArgs(
        @Nullable Input<LinkTypes> linkType,
        Input<String> sourcePropertyName,
        Input<String> targetPropertyName) {
        this.linkType = linkType;
        this.sourcePropertyName = Objects.requireNonNull(sourcePropertyName, "expected parameter 'sourcePropertyName' to be non-null");
        this.targetPropertyName = Objects.requireNonNull(targetPropertyName, "expected parameter 'targetPropertyName' to be non-null");
    }

    private TypePropertiesMappingArgs() {
        this.linkType = Input.empty();
        this.sourcePropertyName = Input.empty();
        this.targetPropertyName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TypePropertiesMappingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<LinkTypes> linkType;
        private Input<String> sourcePropertyName;
        private Input<String> targetPropertyName;

        public Builder() {
    	      // Empty
        }

        public Builder(TypePropertiesMappingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.linkType = defaults.linkType;
    	      this.sourcePropertyName = defaults.sourcePropertyName;
    	      this.targetPropertyName = defaults.targetPropertyName;
        }

        public Builder setLinkType(@Nullable Input<LinkTypes> linkType) {
            this.linkType = linkType;
            return this;
        }

        public Builder setLinkType(@Nullable LinkTypes linkType) {
            this.linkType = Input.ofNullable(linkType);
            return this;
        }

        public Builder setSourcePropertyName(Input<String> sourcePropertyName) {
            this.sourcePropertyName = Objects.requireNonNull(sourcePropertyName);
            return this;
        }

        public Builder setSourcePropertyName(String sourcePropertyName) {
            this.sourcePropertyName = Input.of(Objects.requireNonNull(sourcePropertyName));
            return this;
        }

        public Builder setTargetPropertyName(Input<String> targetPropertyName) {
            this.targetPropertyName = Objects.requireNonNull(targetPropertyName);
            return this;
        }

        public Builder setTargetPropertyName(String targetPropertyName) {
            this.targetPropertyName = Input.of(Objects.requireNonNull(targetPropertyName));
            return this;
        }

        public TypePropertiesMappingArgs build() {
            return new TypePropertiesMappingArgs(linkType, sourcePropertyName, targetPropertyName);
        }
    }
}
