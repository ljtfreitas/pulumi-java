// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cfg;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.cfg.RemediationConfigurationArgs;
import io.pulumi.aws.cfg.inputs.RemediationConfigurationState;
import io.pulumi.aws.cfg.outputs.RemediationConfigurationExecutionControls;
import io.pulumi.aws.cfg.outputs.RemediationConfigurationParameter;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Provides an AWS Config Remediation Configuration.
 * 
 * > **Note:** Config Remediation Configuration requires an existing Config Rule to be present.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Remediation Configurations can be imported using the name config_rule_name, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:cfg/remediationConfiguration:RemediationConfiguration this example
 * ```
 * 
 */
@ResourceType(type="aws:cfg/remediationConfiguration:RemediationConfiguration")
public class RemediationConfiguration extends io.pulumi.resources.CustomResource {
    /**
     * ARN of the Config Remediation Configuration.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return ARN of the Config Remediation Configuration.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * Remediation is triggered automatically if `true`.
     * 
     */
    @OutputExport(name="automatic", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> automatic;

    /**
     * @return Remediation is triggered automatically if `true`.
     * 
     */
    public Output</* @Nullable */ Boolean> getAutomatic() {
        return this.automatic;
    }
    /**
     * Name of the AWS Config rule.
     * 
     */
    @OutputExport(name="configRuleName", type=String.class, parameters={})
    private Output<String> configRuleName;

    /**
     * @return Name of the AWS Config rule.
     * 
     */
    public Output<String> getConfigRuleName() {
        return this.configRuleName;
    }
    /**
     * Configuration block for execution controls. See below.
     * 
     */
    @OutputExport(name="executionControls", type=RemediationConfigurationExecutionControls.class, parameters={})
    private Output</* @Nullable */ RemediationConfigurationExecutionControls> executionControls;

    /**
     * @return Configuration block for execution controls. See below.
     * 
     */
    public Output</* @Nullable */ RemediationConfigurationExecutionControls> getExecutionControls() {
        return this.executionControls;
    }
    /**
     * Maximum number of failed attempts for auto-remediation. If you do not select a number, the default is 5.
     * 
     */
    @OutputExport(name="maximumAutomaticAttempts", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> maximumAutomaticAttempts;

    /**
     * @return Maximum number of failed attempts for auto-remediation. If you do not select a number, the default is 5.
     * 
     */
    public Output</* @Nullable */ Integer> getMaximumAutomaticAttempts() {
        return this.maximumAutomaticAttempts;
    }
    /**
     * Can be specified multiple times for each parameter. Each parameter block supports arguments below.
     * 
     */
    @OutputExport(name="parameters", type=List.class, parameters={RemediationConfigurationParameter.class})
    private Output</* @Nullable */ List<RemediationConfigurationParameter>> parameters;

    /**
     * @return Can be specified multiple times for each parameter. Each parameter block supports arguments below.
     * 
     */
    public Output</* @Nullable */ List<RemediationConfigurationParameter>> getParameters() {
        return this.parameters;
    }
    /**
     * Type of resource.
     * 
     */
    @OutputExport(name="resourceType", type=String.class, parameters={})
    private Output</* @Nullable */ String> resourceType;

    /**
     * @return Type of resource.
     * 
     */
    public Output</* @Nullable */ String> getPropResourceType() {
        return this.resourceType;
    }
    /**
     * Maximum time in seconds that AWS Config runs auto-remediation. If you do not select a number, the default is 60 seconds.
     * 
     */
    @OutputExport(name="retryAttemptSeconds", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> retryAttemptSeconds;

    /**
     * @return Maximum time in seconds that AWS Config runs auto-remediation. If you do not select a number, the default is 60 seconds.
     * 
     */
    public Output</* @Nullable */ Integer> getRetryAttemptSeconds() {
        return this.retryAttemptSeconds;
    }
    /**
     * Target ID is the name of the public document.
     * 
     */
    @OutputExport(name="targetId", type=String.class, parameters={})
    private Output<String> targetId;

    /**
     * @return Target ID is the name of the public document.
     * 
     */
    public Output<String> getTargetId() {
        return this.targetId;
    }
    /**
     * Type of the target. Target executes remediation. For example, SSM document.
     * 
     */
    @OutputExport(name="targetType", type=String.class, parameters={})
    private Output<String> targetType;

    /**
     * @return Type of the target. Target executes remediation. For example, SSM document.
     * 
     */
    public Output<String> getTargetType() {
        return this.targetType;
    }
    /**
     * Version of the target. For example, version of the SSM document
     * 
     */
    @OutputExport(name="targetVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> targetVersion;

    /**
     * @return Version of the target. For example, version of the SSM document
     * 
     */
    public Output</* @Nullable */ String> getTargetVersion() {
        return this.targetVersion;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RemediationConfiguration(String name, RemediationConfigurationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:cfg/remediationConfiguration:RemediationConfiguration", name, args == null ? RemediationConfigurationArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private RemediationConfiguration(String name, Input<String> id, @Nullable RemediationConfigurationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:cfg/remediationConfiguration:RemediationConfiguration", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static RemediationConfiguration get(String name, Input<String> id, @Nullable RemediationConfigurationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new RemediationConfiguration(name, id, state, options);
    }
}
