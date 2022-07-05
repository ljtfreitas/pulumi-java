// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specifies options for controlling advanced machine features. Options that would traditionally be configured in a BIOS belong here. Features that require operating system support may have corresponding entries in the GuestOsFeatures of an Image (e.g., whether or not the OS in the Image supports nested virtualization being enabled or disabled).
 * 
 */
public final class AdvancedMachineFeaturesArgs extends com.pulumi.resources.ResourceArgs {

    public static final AdvancedMachineFeaturesArgs Empty = new AdvancedMachineFeaturesArgs();

    /**
     * Whether to enable nested virtualization or not (default is false).
     * 
     */
    @Import(name="enableNestedVirtualization")
    private @Nullable Output<Boolean> enableNestedVirtualization;

    /**
     * @return Whether to enable nested virtualization or not (default is false).
     * 
     */
    public Optional<Output<Boolean>> enableNestedVirtualization() {
        return Optional.ofNullable(this.enableNestedVirtualization);
    }

    /**
     * Whether to enable UEFI networking for instance creation.
     * 
     */
    @Import(name="enableUefiNetworking")
    private @Nullable Output<Boolean> enableUefiNetworking;

    /**
     * @return Whether to enable UEFI networking for instance creation.
     * 
     */
    public Optional<Output<Boolean>> enableUefiNetworking() {
        return Optional.ofNullable(this.enableUefiNetworking);
    }

    /**
     * The number of threads per physical core. To disable simultaneous multithreading (SMT) set this to 1. If unset, the maximum number of threads supported per core by the underlying processor is assumed.
     * 
     */
    @Import(name="threadsPerCore")
    private @Nullable Output<Integer> threadsPerCore;

    /**
     * @return The number of threads per physical core. To disable simultaneous multithreading (SMT) set this to 1. If unset, the maximum number of threads supported per core by the underlying processor is assumed.
     * 
     */
    public Optional<Output<Integer>> threadsPerCore() {
        return Optional.ofNullable(this.threadsPerCore);
    }

    /**
     * The number of physical cores to expose to an instance. Multiply by the number of threads per core to compute the total number of virtual CPUs to expose to the instance. If unset, the number of cores is inferred from the instance&#39;s nominal CPU count and the underlying platform&#39;s SMT width.
     * 
     */
    @Import(name="visibleCoreCount")
    private @Nullable Output<Integer> visibleCoreCount;

    /**
     * @return The number of physical cores to expose to an instance. Multiply by the number of threads per core to compute the total number of virtual CPUs to expose to the instance. If unset, the number of cores is inferred from the instance&#39;s nominal CPU count and the underlying platform&#39;s SMT width.
     * 
     */
    public Optional<Output<Integer>> visibleCoreCount() {
        return Optional.ofNullable(this.visibleCoreCount);
    }

    private AdvancedMachineFeaturesArgs() {}

    private AdvancedMachineFeaturesArgs(AdvancedMachineFeaturesArgs $) {
        this.enableNestedVirtualization = $.enableNestedVirtualization;
        this.enableUefiNetworking = $.enableUefiNetworking;
        this.threadsPerCore = $.threadsPerCore;
        this.visibleCoreCount = $.visibleCoreCount;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AdvancedMachineFeaturesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AdvancedMachineFeaturesArgs $;

        public Builder() {
            $ = new AdvancedMachineFeaturesArgs();
        }

        public Builder(AdvancedMachineFeaturesArgs defaults) {
            $ = new AdvancedMachineFeaturesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enableNestedVirtualization Whether to enable nested virtualization or not (default is false).
         * 
         * @return builder
         * 
         */
        public Builder enableNestedVirtualization(@Nullable Output<Boolean> enableNestedVirtualization) {
            $.enableNestedVirtualization = enableNestedVirtualization;
            return this;
        }

        /**
         * @param enableNestedVirtualization Whether to enable nested virtualization or not (default is false).
         * 
         * @return builder
         * 
         */
        public Builder enableNestedVirtualization(Boolean enableNestedVirtualization) {
            return enableNestedVirtualization(Output.of(enableNestedVirtualization));
        }

        /**
         * @param enableUefiNetworking Whether to enable UEFI networking for instance creation.
         * 
         * @return builder
         * 
         */
        public Builder enableUefiNetworking(@Nullable Output<Boolean> enableUefiNetworking) {
            $.enableUefiNetworking = enableUefiNetworking;
            return this;
        }

        /**
         * @param enableUefiNetworking Whether to enable UEFI networking for instance creation.
         * 
         * @return builder
         * 
         */
        public Builder enableUefiNetworking(Boolean enableUefiNetworking) {
            return enableUefiNetworking(Output.of(enableUefiNetworking));
        }

        /**
         * @param threadsPerCore The number of threads per physical core. To disable simultaneous multithreading (SMT) set this to 1. If unset, the maximum number of threads supported per core by the underlying processor is assumed.
         * 
         * @return builder
         * 
         */
        public Builder threadsPerCore(@Nullable Output<Integer> threadsPerCore) {
            $.threadsPerCore = threadsPerCore;
            return this;
        }

        /**
         * @param threadsPerCore The number of threads per physical core. To disable simultaneous multithreading (SMT) set this to 1. If unset, the maximum number of threads supported per core by the underlying processor is assumed.
         * 
         * @return builder
         * 
         */
        public Builder threadsPerCore(Integer threadsPerCore) {
            return threadsPerCore(Output.of(threadsPerCore));
        }

        /**
         * @param visibleCoreCount The number of physical cores to expose to an instance. Multiply by the number of threads per core to compute the total number of virtual CPUs to expose to the instance. If unset, the number of cores is inferred from the instance&#39;s nominal CPU count and the underlying platform&#39;s SMT width.
         * 
         * @return builder
         * 
         */
        public Builder visibleCoreCount(@Nullable Output<Integer> visibleCoreCount) {
            $.visibleCoreCount = visibleCoreCount;
            return this;
        }

        /**
         * @param visibleCoreCount The number of physical cores to expose to an instance. Multiply by the number of threads per core to compute the total number of virtual CPUs to expose to the instance. If unset, the number of cores is inferred from the instance&#39;s nominal CPU count and the underlying platform&#39;s SMT width.
         * 
         * @return builder
         * 
         */
        public Builder visibleCoreCount(Integer visibleCoreCount) {
            return visibleCoreCount(Output.of(visibleCoreCount));
        }

        public AdvancedMachineFeaturesArgs build() {
            return $;
        }
    }

}
