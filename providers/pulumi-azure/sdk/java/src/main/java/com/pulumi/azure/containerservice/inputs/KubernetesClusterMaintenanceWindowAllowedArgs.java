// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerservice.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class KubernetesClusterMaintenanceWindowAllowedArgs extends com.pulumi.resources.ResourceArgs {

    public static final KubernetesClusterMaintenanceWindowAllowedArgs Empty = new KubernetesClusterMaintenanceWindowAllowedArgs();

    /**
     * A day in a week. Possible values are `Sunday`, `Monday`, `Tuesday`, `Wednesday`, `Thursday`, `Friday` and `Saturday`.
     * 
     */
    @Import(name="day", required=true)
    private Output<String> day;

    /**
     * @return A day in a week. Possible values are `Sunday`, `Monday`, `Tuesday`, `Wednesday`, `Thursday`, `Friday` and `Saturday`.
     * 
     */
    public Output<String> day() {
        return this.day;
    }

    /**
     * An array of hour slots in a day. For example, specifying `1` will allow maintenance from 1:00am to 2:00am. Specifying `1`, `2` will allow maintenance from 1:00am to 3:00m. Possible values are between `0` and `23`.
     * 
     */
    @Import(name="hours", required=true)
    private Output<List<Integer>> hours;

    /**
     * @return An array of hour slots in a day. For example, specifying `1` will allow maintenance from 1:00am to 2:00am. Specifying `1`, `2` will allow maintenance from 1:00am to 3:00m. Possible values are between `0` and `23`.
     * 
     */
    public Output<List<Integer>> hours() {
        return this.hours;
    }

    private KubernetesClusterMaintenanceWindowAllowedArgs() {}

    private KubernetesClusterMaintenanceWindowAllowedArgs(KubernetesClusterMaintenanceWindowAllowedArgs $) {
        this.day = $.day;
        this.hours = $.hours;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KubernetesClusterMaintenanceWindowAllowedArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KubernetesClusterMaintenanceWindowAllowedArgs $;

        public Builder() {
            $ = new KubernetesClusterMaintenanceWindowAllowedArgs();
        }

        public Builder(KubernetesClusterMaintenanceWindowAllowedArgs defaults) {
            $ = new KubernetesClusterMaintenanceWindowAllowedArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param day A day in a week. Possible values are `Sunday`, `Monday`, `Tuesday`, `Wednesday`, `Thursday`, `Friday` and `Saturday`.
         * 
         * @return builder
         * 
         */
        public Builder day(Output<String> day) {
            $.day = day;
            return this;
        }

        /**
         * @param day A day in a week. Possible values are `Sunday`, `Monday`, `Tuesday`, `Wednesday`, `Thursday`, `Friday` and `Saturday`.
         * 
         * @return builder
         * 
         */
        public Builder day(String day) {
            return day(Output.of(day));
        }

        /**
         * @param hours An array of hour slots in a day. For example, specifying `1` will allow maintenance from 1:00am to 2:00am. Specifying `1`, `2` will allow maintenance from 1:00am to 3:00m. Possible values are between `0` and `23`.
         * 
         * @return builder
         * 
         */
        public Builder hours(Output<List<Integer>> hours) {
            $.hours = hours;
            return this;
        }

        /**
         * @param hours An array of hour slots in a day. For example, specifying `1` will allow maintenance from 1:00am to 2:00am. Specifying `1`, `2` will allow maintenance from 1:00am to 3:00m. Possible values are between `0` and `23`.
         * 
         * @return builder
         * 
         */
        public Builder hours(List<Integer> hours) {
            return hours(Output.of(hours));
        }

        /**
         * @param hours An array of hour slots in a day. For example, specifying `1` will allow maintenance from 1:00am to 2:00am. Specifying `1`, `2` will allow maintenance from 1:00am to 3:00m. Possible values are between `0` and `23`.
         * 
         * @return builder
         * 
         */
        public Builder hours(Integer... hours) {
            return hours(List.of(hours));
        }

        public KubernetesClusterMaintenanceWindowAllowedArgs build() {
            $.day = Objects.requireNonNull($.day, "expected parameter 'day' to be non-null");
            $.hours = Objects.requireNonNull($.hours, "expected parameter 'hours' to be non-null");
            return $;
        }
    }

}
