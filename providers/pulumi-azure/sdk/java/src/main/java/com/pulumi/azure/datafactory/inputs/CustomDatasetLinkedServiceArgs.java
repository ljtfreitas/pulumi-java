// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.datafactory.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CustomDatasetLinkedServiceArgs extends com.pulumi.resources.ResourceArgs {

    public static final CustomDatasetLinkedServiceArgs Empty = new CustomDatasetLinkedServiceArgs();

    /**
     * The name of the Data Factory Linked Service.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the Data Factory Linked Service.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * A map of parameters to associate with the Data Factory Linked Service.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<Map<String,String>> parameters;

    /**
     * @return A map of parameters to associate with the Data Factory Linked Service.
     * 
     */
    public Optional<Output<Map<String,String>>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    private CustomDatasetLinkedServiceArgs() {}

    private CustomDatasetLinkedServiceArgs(CustomDatasetLinkedServiceArgs $) {
        this.name = $.name;
        this.parameters = $.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CustomDatasetLinkedServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomDatasetLinkedServiceArgs $;

        public Builder() {
            $ = new CustomDatasetLinkedServiceArgs();
        }

        public Builder(CustomDatasetLinkedServiceArgs defaults) {
            $ = new CustomDatasetLinkedServiceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the Data Factory Linked Service.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Data Factory Linked Service.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param parameters A map of parameters to associate with the Data Factory Linked Service.
         * 
         * @return builder
         * 
         */
        public Builder parameters(@Nullable Output<Map<String,String>> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param parameters A map of parameters to associate with the Data Factory Linked Service.
         * 
         * @return builder
         * 
         */
        public Builder parameters(Map<String,String> parameters) {
            return parameters(Output.of(parameters));
        }

        public CustomDatasetLinkedServiceArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
