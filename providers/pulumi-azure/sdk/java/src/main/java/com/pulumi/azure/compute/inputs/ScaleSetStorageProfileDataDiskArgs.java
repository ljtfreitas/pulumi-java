// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ScaleSetStorageProfileDataDiskArgs extends com.pulumi.resources.ResourceArgs {

    public static final ScaleSetStorageProfileDataDiskArgs Empty = new ScaleSetStorageProfileDataDiskArgs();

    /**
     * Specifies the caching requirements. Possible values include: `None` (default), `ReadOnly`, `ReadWrite`.
     * 
     */
    @Import(name="caching")
    private @Nullable Output<String> caching;

    /**
     * @return Specifies the caching requirements. Possible values include: `None` (default), `ReadOnly`, `ReadWrite`.
     * 
     */
    public Optional<Output<String>> caching() {
        return Optional.ofNullable(this.caching);
    }

    /**
     * Specifies how the data disk should be created. The only possible options are `FromImage` and `Empty`.
     * 
     */
    @Import(name="createOption", required=true)
    private Output<String> createOption;

    /**
     * @return Specifies how the data disk should be created. The only possible options are `FromImage` and `Empty`.
     * 
     */
    public Output<String> createOption() {
        return this.createOption;
    }

    /**
     * Specifies the size of the disk in GB. This element is required when creating an empty disk.
     * 
     */
    @Import(name="diskSizeGb")
    private @Nullable Output<Integer> diskSizeGb;

    /**
     * @return Specifies the size of the disk in GB. This element is required when creating an empty disk.
     * 
     */
    public Optional<Output<Integer>> diskSizeGb() {
        return Optional.ofNullable(this.diskSizeGb);
    }

    /**
     * Specifies the Logical Unit Number of the disk in each virtual machine in the scale set.
     * 
     */
    @Import(name="lun", required=true)
    private Output<Integer> lun;

    /**
     * @return Specifies the Logical Unit Number of the disk in each virtual machine in the scale set.
     * 
     */
    public Output<Integer> lun() {
        return this.lun;
    }

    /**
     * Specifies the type of managed disk to create. Value must be either `Standard_LRS`, `StandardSSD_LRS` or `Premium_LRS`.
     * 
     */
    @Import(name="managedDiskType")
    private @Nullable Output<String> managedDiskType;

    /**
     * @return Specifies the type of managed disk to create. Value must be either `Standard_LRS`, `StandardSSD_LRS` or `Premium_LRS`.
     * 
     */
    public Optional<Output<String>> managedDiskType() {
        return Optional.ofNullable(this.managedDiskType);
    }

    private ScaleSetStorageProfileDataDiskArgs() {}

    private ScaleSetStorageProfileDataDiskArgs(ScaleSetStorageProfileDataDiskArgs $) {
        this.caching = $.caching;
        this.createOption = $.createOption;
        this.diskSizeGb = $.diskSizeGb;
        this.lun = $.lun;
        this.managedDiskType = $.managedDiskType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ScaleSetStorageProfileDataDiskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ScaleSetStorageProfileDataDiskArgs $;

        public Builder() {
            $ = new ScaleSetStorageProfileDataDiskArgs();
        }

        public Builder(ScaleSetStorageProfileDataDiskArgs defaults) {
            $ = new ScaleSetStorageProfileDataDiskArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param caching Specifies the caching requirements. Possible values include: `None` (default), `ReadOnly`, `ReadWrite`.
         * 
         * @return builder
         * 
         */
        public Builder caching(@Nullable Output<String> caching) {
            $.caching = caching;
            return this;
        }

        /**
         * @param caching Specifies the caching requirements. Possible values include: `None` (default), `ReadOnly`, `ReadWrite`.
         * 
         * @return builder
         * 
         */
        public Builder caching(String caching) {
            return caching(Output.of(caching));
        }

        /**
         * @param createOption Specifies how the data disk should be created. The only possible options are `FromImage` and `Empty`.
         * 
         * @return builder
         * 
         */
        public Builder createOption(Output<String> createOption) {
            $.createOption = createOption;
            return this;
        }

        /**
         * @param createOption Specifies how the data disk should be created. The only possible options are `FromImage` and `Empty`.
         * 
         * @return builder
         * 
         */
        public Builder createOption(String createOption) {
            return createOption(Output.of(createOption));
        }

        /**
         * @param diskSizeGb Specifies the size of the disk in GB. This element is required when creating an empty disk.
         * 
         * @return builder
         * 
         */
        public Builder diskSizeGb(@Nullable Output<Integer> diskSizeGb) {
            $.diskSizeGb = diskSizeGb;
            return this;
        }

        /**
         * @param diskSizeGb Specifies the size of the disk in GB. This element is required when creating an empty disk.
         * 
         * @return builder
         * 
         */
        public Builder diskSizeGb(Integer diskSizeGb) {
            return diskSizeGb(Output.of(diskSizeGb));
        }

        /**
         * @param lun Specifies the Logical Unit Number of the disk in each virtual machine in the scale set.
         * 
         * @return builder
         * 
         */
        public Builder lun(Output<Integer> lun) {
            $.lun = lun;
            return this;
        }

        /**
         * @param lun Specifies the Logical Unit Number of the disk in each virtual machine in the scale set.
         * 
         * @return builder
         * 
         */
        public Builder lun(Integer lun) {
            return lun(Output.of(lun));
        }

        /**
         * @param managedDiskType Specifies the type of managed disk to create. Value must be either `Standard_LRS`, `StandardSSD_LRS` or `Premium_LRS`.
         * 
         * @return builder
         * 
         */
        public Builder managedDiskType(@Nullable Output<String> managedDiskType) {
            $.managedDiskType = managedDiskType;
            return this;
        }

        /**
         * @param managedDiskType Specifies the type of managed disk to create. Value must be either `Standard_LRS`, `StandardSSD_LRS` or `Premium_LRS`.
         * 
         * @return builder
         * 
         */
        public Builder managedDiskType(String managedDiskType) {
            return managedDiskType(Output.of(managedDiskType));
        }

        public ScaleSetStorageProfileDataDiskArgs build() {
            $.createOption = Objects.requireNonNull($.createOption, "expected parameter 'createOption' to be non-null");
            $.lun = Objects.requireNonNull($.lun, "expected parameter 'lun' to be non-null");
            return $;
        }
    }

}
