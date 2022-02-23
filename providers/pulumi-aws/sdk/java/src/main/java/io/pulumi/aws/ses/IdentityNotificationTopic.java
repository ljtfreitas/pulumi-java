// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ses;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ses.IdentityNotificationTopicArgs;
import io.pulumi.aws.ses.inputs.IdentityNotificationTopicState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Resource for managing SES Identity Notification Topics
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Identity Notification Topics can be imported using ID of the record. The ID is made up as IDENTITY|TYPE where IDENTITY is the SES Identity and TYPE is the Notification Type.
 * 
 * ```sh
 *  $ pulumi import aws:ses/identityNotificationTopic:IdentityNotificationTopic test 'example.com|Bounce'
 * ```
 * 
 */
@ResourceType(type="aws:ses/identityNotificationTopic:IdentityNotificationTopic")
public class IdentityNotificationTopic extends io.pulumi.resources.CustomResource {
    /**
     * The identity for which the Amazon SNS topic will be set. You can specify an identity by using its name or by using its Amazon Resource Name (ARN).
     * 
     */
    @OutputExport(name="identity", type=String.class, parameters={})
    private Output<String> identity;

    /**
     * @return The identity for which the Amazon SNS topic will be set. You can specify an identity by using its name or by using its Amazon Resource Name (ARN).
     * 
     */
    public Output<String> getIdentity() {
        return this.identity;
    }
    /**
     * Whether SES should include original email headers in SNS notifications of this type. *false* by default.
     * 
     */
    @OutputExport(name="includeOriginalHeaders", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> includeOriginalHeaders;

    /**
     * @return Whether SES should include original email headers in SNS notifications of this type. *false* by default.
     * 
     */
    public Output</* @Nullable */ Boolean> getIncludeOriginalHeaders() {
        return this.includeOriginalHeaders;
    }
    /**
     * The type of notifications that will be published to the specified Amazon SNS topic. Valid Values: *Bounce*, *Complaint* or *Delivery*.
     * 
     */
    @OutputExport(name="notificationType", type=String.class, parameters={})
    private Output<String> notificationType;

    /**
     * @return The type of notifications that will be published to the specified Amazon SNS topic. Valid Values: *Bounce*, *Complaint* or *Delivery*.
     * 
     */
    public Output<String> getNotificationType() {
        return this.notificationType;
    }
    /**
     * The Amazon Resource Name (ARN) of the Amazon SNS topic. Can be set to "" (an empty string) to disable publishing.
     * 
     */
    @OutputExport(name="topicArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> topicArn;

    /**
     * @return The Amazon Resource Name (ARN) of the Amazon SNS topic. Can be set to "" (an empty string) to disable publishing.
     * 
     */
    public Output</* @Nullable */ String> getTopicArn() {
        return this.topicArn;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public IdentityNotificationTopic(String name, IdentityNotificationTopicArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ses/identityNotificationTopic:IdentityNotificationTopic", name, args == null ? IdentityNotificationTopicArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private IdentityNotificationTopic(String name, Input<String> id, @Nullable IdentityNotificationTopicState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ses/identityNotificationTopic:IdentityNotificationTopic", name, state, makeResourceOptions(options, id));
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
    public static IdentityNotificationTopic get(String name, Input<String> id, @Nullable IdentityNotificationTopicState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new IdentityNotificationTopic(name, id, state, options);
    }
}