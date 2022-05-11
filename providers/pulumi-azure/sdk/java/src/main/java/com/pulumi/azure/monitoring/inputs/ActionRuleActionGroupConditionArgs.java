// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.monitoring.inputs;

import com.pulumi.azure.monitoring.inputs.ActionRuleActionGroupConditionAlertContextArgs;
import com.pulumi.azure.monitoring.inputs.ActionRuleActionGroupConditionAlertRuleIdArgs;
import com.pulumi.azure.monitoring.inputs.ActionRuleActionGroupConditionDescriptionArgs;
import com.pulumi.azure.monitoring.inputs.ActionRuleActionGroupConditionMonitorArgs;
import com.pulumi.azure.monitoring.inputs.ActionRuleActionGroupConditionMonitorServiceArgs;
import com.pulumi.azure.monitoring.inputs.ActionRuleActionGroupConditionSeverityArgs;
import com.pulumi.azure.monitoring.inputs.ActionRuleActionGroupConditionTargetResourceTypeArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ActionRuleActionGroupConditionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ActionRuleActionGroupConditionArgs Empty = new ActionRuleActionGroupConditionArgs();

    /**
     * A `alert_context` block as defined below.
     * 
     */
    @Import(name="alertContext")
    private @Nullable Output<ActionRuleActionGroupConditionAlertContextArgs> alertContext;

    /**
     * @return A `alert_context` block as defined below.
     * 
     */
    public Optional<Output<ActionRuleActionGroupConditionAlertContextArgs>> alertContext() {
        return Optional.ofNullable(this.alertContext);
    }

    /**
     * A `alert_rule_id` block as defined below.
     * 
     */
    @Import(name="alertRuleId")
    private @Nullable Output<ActionRuleActionGroupConditionAlertRuleIdArgs> alertRuleId;

    /**
     * @return A `alert_rule_id` block as defined below.
     * 
     */
    public Optional<Output<ActionRuleActionGroupConditionAlertRuleIdArgs>> alertRuleId() {
        return Optional.ofNullable(this.alertRuleId);
    }

    /**
     * A `description` block as defined below.
     * 
     */
    @Import(name="description")
    private @Nullable Output<ActionRuleActionGroupConditionDescriptionArgs> description;

    /**
     * @return A `description` block as defined below.
     * 
     */
    public Optional<Output<ActionRuleActionGroupConditionDescriptionArgs>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * A `monitor` block as defined below.
     * 
     */
    @Import(name="monitor")
    private @Nullable Output<ActionRuleActionGroupConditionMonitorArgs> monitor;

    /**
     * @return A `monitor` block as defined below.
     * 
     */
    public Optional<Output<ActionRuleActionGroupConditionMonitorArgs>> monitor() {
        return Optional.ofNullable(this.monitor);
    }

    /**
     * A `monitor_service` as block defined below.
     * 
     */
    @Import(name="monitorService")
    private @Nullable Output<ActionRuleActionGroupConditionMonitorServiceArgs> monitorService;

    /**
     * @return A `monitor_service` as block defined below.
     * 
     */
    public Optional<Output<ActionRuleActionGroupConditionMonitorServiceArgs>> monitorService() {
        return Optional.ofNullable(this.monitorService);
    }

    /**
     * A `severity` block as defined below.
     * 
     */
    @Import(name="severity")
    private @Nullable Output<ActionRuleActionGroupConditionSeverityArgs> severity;

    /**
     * @return A `severity` block as defined below.
     * 
     */
    public Optional<Output<ActionRuleActionGroupConditionSeverityArgs>> severity() {
        return Optional.ofNullable(this.severity);
    }

    /**
     * A `target_resource_type` block as defined below.
     * 
     */
    @Import(name="targetResourceType")
    private @Nullable Output<ActionRuleActionGroupConditionTargetResourceTypeArgs> targetResourceType;

    /**
     * @return A `target_resource_type` block as defined below.
     * 
     */
    public Optional<Output<ActionRuleActionGroupConditionTargetResourceTypeArgs>> targetResourceType() {
        return Optional.ofNullable(this.targetResourceType);
    }

    private ActionRuleActionGroupConditionArgs() {}

    private ActionRuleActionGroupConditionArgs(ActionRuleActionGroupConditionArgs $) {
        this.alertContext = $.alertContext;
        this.alertRuleId = $.alertRuleId;
        this.description = $.description;
        this.monitor = $.monitor;
        this.monitorService = $.monitorService;
        this.severity = $.severity;
        this.targetResourceType = $.targetResourceType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ActionRuleActionGroupConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ActionRuleActionGroupConditionArgs $;

        public Builder() {
            $ = new ActionRuleActionGroupConditionArgs();
        }

        public Builder(ActionRuleActionGroupConditionArgs defaults) {
            $ = new ActionRuleActionGroupConditionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param alertContext A `alert_context` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder alertContext(@Nullable Output<ActionRuleActionGroupConditionAlertContextArgs> alertContext) {
            $.alertContext = alertContext;
            return this;
        }

        /**
         * @param alertContext A `alert_context` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder alertContext(ActionRuleActionGroupConditionAlertContextArgs alertContext) {
            return alertContext(Output.of(alertContext));
        }

        /**
         * @param alertRuleId A `alert_rule_id` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder alertRuleId(@Nullable Output<ActionRuleActionGroupConditionAlertRuleIdArgs> alertRuleId) {
            $.alertRuleId = alertRuleId;
            return this;
        }

        /**
         * @param alertRuleId A `alert_rule_id` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder alertRuleId(ActionRuleActionGroupConditionAlertRuleIdArgs alertRuleId) {
            return alertRuleId(Output.of(alertRuleId));
        }

        /**
         * @param description A `description` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<ActionRuleActionGroupConditionDescriptionArgs> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A `description` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder description(ActionRuleActionGroupConditionDescriptionArgs description) {
            return description(Output.of(description));
        }

        /**
         * @param monitor A `monitor` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder monitor(@Nullable Output<ActionRuleActionGroupConditionMonitorArgs> monitor) {
            $.monitor = monitor;
            return this;
        }

        /**
         * @param monitor A `monitor` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder monitor(ActionRuleActionGroupConditionMonitorArgs monitor) {
            return monitor(Output.of(monitor));
        }

        /**
         * @param monitorService A `monitor_service` as block defined below.
         * 
         * @return builder
         * 
         */
        public Builder monitorService(@Nullable Output<ActionRuleActionGroupConditionMonitorServiceArgs> monitorService) {
            $.monitorService = monitorService;
            return this;
        }

        /**
         * @param monitorService A `monitor_service` as block defined below.
         * 
         * @return builder
         * 
         */
        public Builder monitorService(ActionRuleActionGroupConditionMonitorServiceArgs monitorService) {
            return monitorService(Output.of(monitorService));
        }

        /**
         * @param severity A `severity` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder severity(@Nullable Output<ActionRuleActionGroupConditionSeverityArgs> severity) {
            $.severity = severity;
            return this;
        }

        /**
         * @param severity A `severity` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder severity(ActionRuleActionGroupConditionSeverityArgs severity) {
            return severity(Output.of(severity));
        }

        /**
         * @param targetResourceType A `target_resource_type` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder targetResourceType(@Nullable Output<ActionRuleActionGroupConditionTargetResourceTypeArgs> targetResourceType) {
            $.targetResourceType = targetResourceType;
            return this;
        }

        /**
         * @param targetResourceType A `target_resource_type` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder targetResourceType(ActionRuleActionGroupConditionTargetResourceTypeArgs targetResourceType) {
            return targetResourceType(Output.of(targetResourceType));
        }

        public ActionRuleActionGroupConditionArgs build() {
            return $;
        }
    }

}
