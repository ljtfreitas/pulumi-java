// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LicenseResourceRequirementsArgs extends com.pulumi.resources.ResourceArgs {

    public static final LicenseResourceRequirementsArgs Empty = new LicenseResourceRequirementsArgs();

    /**
     * Minimum number of guest cpus required to use the Instance. Enforced at Instance creation and Instance start.
     * 
     */
    @Import(name="minGuestCpuCount")
    private @Nullable Output<Integer> minGuestCpuCount;

    /**
     * @return Minimum number of guest cpus required to use the Instance. Enforced at Instance creation and Instance start.
     * 
     */
    public Optional<Output<Integer>> minGuestCpuCount() {
        return Optional.ofNullable(this.minGuestCpuCount);
    }

    /**
     * Minimum memory required to use the Instance. Enforced at Instance creation and Instance start.
     * 
     */
    @Import(name="minMemoryMb")
    private @Nullable Output<Integer> minMemoryMb;

    /**
     * @return Minimum memory required to use the Instance. Enforced at Instance creation and Instance start.
     * 
     */
    public Optional<Output<Integer>> minMemoryMb() {
        return Optional.ofNullable(this.minMemoryMb);
    }

    private LicenseResourceRequirementsArgs() {}

    private LicenseResourceRequirementsArgs(LicenseResourceRequirementsArgs $) {
        this.minGuestCpuCount = $.minGuestCpuCount;
        this.minMemoryMb = $.minMemoryMb;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LicenseResourceRequirementsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LicenseResourceRequirementsArgs $;

        public Builder() {
            $ = new LicenseResourceRequirementsArgs();
        }

        public Builder(LicenseResourceRequirementsArgs defaults) {
            $ = new LicenseResourceRequirementsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param minGuestCpuCount Minimum number of guest cpus required to use the Instance. Enforced at Instance creation and Instance start.
         * 
         * @return builder
         * 
         */
        public Builder minGuestCpuCount(@Nullable Output<Integer> minGuestCpuCount) {
            $.minGuestCpuCount = minGuestCpuCount;
            return this;
        }

        /**
         * @param minGuestCpuCount Minimum number of guest cpus required to use the Instance. Enforced at Instance creation and Instance start.
         * 
         * @return builder
         * 
         */
        public Builder minGuestCpuCount(Integer minGuestCpuCount) {
            return minGuestCpuCount(Output.of(minGuestCpuCount));
        }

        /**
         * @param minMemoryMb Minimum memory required to use the Instance. Enforced at Instance creation and Instance start.
         * 
         * @return builder
         * 
         */
        public Builder minMemoryMb(@Nullable Output<Integer> minMemoryMb) {
            $.minMemoryMb = minMemoryMb;
            return this;
        }

        /**
         * @param minMemoryMb Minimum memory required to use the Instance. Enforced at Instance creation and Instance start.
         * 
         * @return builder
         * 
         */
        public Builder minMemoryMb(Integer minMemoryMb) {
            return minMemoryMb(Output.of(minMemoryMb));
        }

        public LicenseResourceRequirementsArgs build() {
            return $;
        }
    }

}
