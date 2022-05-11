// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ScaleSetStorageProfileImageReferenceArgs extends com.pulumi.resources.ResourceArgs {

    public static final ScaleSetStorageProfileImageReferenceArgs Empty = new ScaleSetStorageProfileImageReferenceArgs();

    /**
     * Specifies the ID of the (custom) image to use to create the virtual
     * machine scale set, as in the example below.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return Specifies the ID of the (custom) image to use to create the virtual
     * machine scale set, as in the example below.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Specifies the offer of the image used to create the virtual machines.
     * 
     */
    @Import(name="offer")
    private @Nullable Output<String> offer;

    /**
     * @return Specifies the offer of the image used to create the virtual machines.
     * 
     */
    public Optional<Output<String>> offer() {
        return Optional.ofNullable(this.offer);
    }

    /**
     * Specifies the publisher of the image used to create the virtual machines.
     * 
     */
    @Import(name="publisher")
    private @Nullable Output<String> publisher;

    /**
     * @return Specifies the publisher of the image used to create the virtual machines.
     * 
     */
    public Optional<Output<String>> publisher() {
        return Optional.ofNullable(this.publisher);
    }

    /**
     * Specifies the SKU of the image used to create the virtual machines.
     * 
     */
    @Import(name="sku")
    private @Nullable Output<String> sku;

    /**
     * @return Specifies the SKU of the image used to create the virtual machines.
     * 
     */
    public Optional<Output<String>> sku() {
        return Optional.ofNullable(this.sku);
    }

    /**
     * Specifies the version of the image used to create the virtual machines.
     * 
     */
    @Import(name="version")
    private @Nullable Output<String> version;

    /**
     * @return Specifies the version of the image used to create the virtual machines.
     * 
     */
    public Optional<Output<String>> version() {
        return Optional.ofNullable(this.version);
    }

    private ScaleSetStorageProfileImageReferenceArgs() {}

    private ScaleSetStorageProfileImageReferenceArgs(ScaleSetStorageProfileImageReferenceArgs $) {
        this.id = $.id;
        this.offer = $.offer;
        this.publisher = $.publisher;
        this.sku = $.sku;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ScaleSetStorageProfileImageReferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ScaleSetStorageProfileImageReferenceArgs $;

        public Builder() {
            $ = new ScaleSetStorageProfileImageReferenceArgs();
        }

        public Builder(ScaleSetStorageProfileImageReferenceArgs defaults) {
            $ = new ScaleSetStorageProfileImageReferenceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id Specifies the ID of the (custom) image to use to create the virtual
         * machine scale set, as in the example below.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id Specifies the ID of the (custom) image to use to create the virtual
         * machine scale set, as in the example below.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param offer Specifies the offer of the image used to create the virtual machines.
         * 
         * @return builder
         * 
         */
        public Builder offer(@Nullable Output<String> offer) {
            $.offer = offer;
            return this;
        }

        /**
         * @param offer Specifies the offer of the image used to create the virtual machines.
         * 
         * @return builder
         * 
         */
        public Builder offer(String offer) {
            return offer(Output.of(offer));
        }

        /**
         * @param publisher Specifies the publisher of the image used to create the virtual machines.
         * 
         * @return builder
         * 
         */
        public Builder publisher(@Nullable Output<String> publisher) {
            $.publisher = publisher;
            return this;
        }

        /**
         * @param publisher Specifies the publisher of the image used to create the virtual machines.
         * 
         * @return builder
         * 
         */
        public Builder publisher(String publisher) {
            return publisher(Output.of(publisher));
        }

        /**
         * @param sku Specifies the SKU of the image used to create the virtual machines.
         * 
         * @return builder
         * 
         */
        public Builder sku(@Nullable Output<String> sku) {
            $.sku = sku;
            return this;
        }

        /**
         * @param sku Specifies the SKU of the image used to create the virtual machines.
         * 
         * @return builder
         * 
         */
        public Builder sku(String sku) {
            return sku(Output.of(sku));
        }

        /**
         * @param version Specifies the version of the image used to create the virtual machines.
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<String> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version Specifies the version of the image used to create the virtual machines.
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            return version(Output.of(version));
        }

        public ScaleSetStorageProfileImageReferenceArgs build() {
            return $;
        }
    }

}
