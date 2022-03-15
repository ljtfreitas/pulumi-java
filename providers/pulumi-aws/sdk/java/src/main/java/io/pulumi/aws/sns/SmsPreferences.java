// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sns;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.sns.SmsPreferencesArgs;
import io.pulumi.aws.sns.inputs.SmsPreferencesState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a way to set SNS SMS preferences.
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws:sns/smsPreferences:SmsPreferences")
public class SmsPreferences extends io.pulumi.resources.CustomResource {
    /**
     * A string, such as your business brand, that is displayed as the sender on the receiving device.
     * 
     */
    @Export(name="defaultSenderId", type=String.class, parameters={})
    private Output</* @Nullable */ String> defaultSenderId;

    /**
     * @return A string, such as your business brand, that is displayed as the sender on the receiving device.
     * 
     */
    public Output</* @Nullable */ String> getDefaultSenderId() {
        return this.defaultSenderId;
    }
    /**
     * The type of SMS message that you will send by default. Possible values are: Promotional, Transactional
     * 
     */
    @Export(name="defaultSmsType", type=String.class, parameters={})
    private Output</* @Nullable */ String> defaultSmsType;

    /**
     * @return The type of SMS message that you will send by default. Possible values are: Promotional, Transactional
     * 
     */
    public Output</* @Nullable */ String> getDefaultSmsType() {
        return this.defaultSmsType;
    }
    /**
     * The ARN of the IAM role that allows Amazon SNS to write logs about SMS deliveries in CloudWatch Logs.
     * 
     */
    @Export(name="deliveryStatusIamRoleArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> deliveryStatusIamRoleArn;

    /**
     * @return The ARN of the IAM role that allows Amazon SNS to write logs about SMS deliveries in CloudWatch Logs.
     * 
     */
    public Output</* @Nullable */ String> getDeliveryStatusIamRoleArn() {
        return this.deliveryStatusIamRoleArn;
    }
    /**
     * The percentage of successful SMS deliveries for which Amazon SNS will write logs in CloudWatch Logs. The value must be between 0 and 100.
     * 
     */
    @Export(name="deliveryStatusSuccessSamplingRate", type=String.class, parameters={})
    private Output</* @Nullable */ String> deliveryStatusSuccessSamplingRate;

    /**
     * @return The percentage of successful SMS deliveries for which Amazon SNS will write logs in CloudWatch Logs. The value must be between 0 and 100.
     * 
     */
    public Output</* @Nullable */ String> getDeliveryStatusSuccessSamplingRate() {
        return this.deliveryStatusSuccessSamplingRate;
    }
    /**
     * The maximum amount in USD that you are willing to spend each month to send SMS messages.
     * 
     */
    @Export(name="monthlySpendLimit", type=Integer.class, parameters={})
    private Output<Integer> monthlySpendLimit;

    /**
     * @return The maximum amount in USD that you are willing to spend each month to send SMS messages.
     * 
     */
    public Output<Integer> getMonthlySpendLimit() {
        return this.monthlySpendLimit;
    }
    /**
     * The name of the Amazon S3 bucket to receive daily SMS usage reports from Amazon SNS.
     * 
     */
    @Export(name="usageReportS3Bucket", type=String.class, parameters={})
    private Output</* @Nullable */ String> usageReportS3Bucket;

    /**
     * @return The name of the Amazon S3 bucket to receive daily SMS usage reports from Amazon SNS.
     * 
     */
    public Output</* @Nullable */ String> getUsageReportS3Bucket() {
        return this.usageReportS3Bucket;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable SmsPreferencesArgs.Builder a);
    }
    private static io.pulumi.aws.sns.SmsPreferencesArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.sns.SmsPreferencesArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public SmsPreferences(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SmsPreferences(String name) {
        this(name, SmsPreferencesArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SmsPreferences(String name, @Nullable SmsPreferencesArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SmsPreferences(String name, @Nullable SmsPreferencesArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:sns/smsPreferences:SmsPreferences", name, args == null ? SmsPreferencesArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private SmsPreferences(String name, Output<String> id, @Nullable SmsPreferencesState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:sns/smsPreferences:SmsPreferences", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
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
    public static SmsPreferences get(String name, Output<String> id, @Nullable SmsPreferencesState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new SmsPreferences(name, id, state, options);
    }
}
