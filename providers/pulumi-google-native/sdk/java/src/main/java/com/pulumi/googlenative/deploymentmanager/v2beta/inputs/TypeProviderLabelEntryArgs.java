// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.deploymentmanager.v2beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Label object for TypeProviders
 * 
 */
public final class TypeProviderLabelEntryArgs extends com.pulumi.resources.ResourceArgs {

    public static final TypeProviderLabelEntryArgs Empty = new TypeProviderLabelEntryArgs();

    /**
     * Key of the label
     * 
     */
    @Import(name="key")
    private @Nullable Output<String> key;

    /**
     * @return Key of the label
     * 
     */
    public Optional<Output<String>> key() {
        return Optional.ofNullable(this.key);
    }

    /**
     * Value of the label
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return Value of the label
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private TypeProviderLabelEntryArgs() {}

    private TypeProviderLabelEntryArgs(TypeProviderLabelEntryArgs $) {
        this.key = $.key;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TypeProviderLabelEntryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TypeProviderLabelEntryArgs $;

        public Builder() {
            $ = new TypeProviderLabelEntryArgs();
        }

        public Builder(TypeProviderLabelEntryArgs defaults) {
            $ = new TypeProviderLabelEntryArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param key Key of the label
         * 
         * @return builder
         * 
         */
        public Builder key(@Nullable Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key Key of the label
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param value Value of the label
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value Value of the label
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public TypeProviderLabelEntryArgs build() {
            return $;
        }
    }

}
