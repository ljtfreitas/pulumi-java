// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sns;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.sns.PlatformApplicationArgs;
import io.pulumi.aws.sns.inputs.PlatformApplicationState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides an SNS platform application resource
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * SNS platform applications can be imported using the ARN, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:sns/platformApplication:PlatformApplication gcm_application arn:aws:sns:us-west-2:0123456789012:app/GCM/gcm_application
 * ```
 * 
 */
@ResourceType(type="aws:sns/platformApplication:PlatformApplication")
public class PlatformApplication extends io.pulumi.resources.CustomResource {
    /**
     * The ARN of the SNS platform application
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN of the SNS platform application
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * SNS Topic triggered when a delivery to any of the platform endpoints associated with your platform application encounters a permanent failure.
     * 
     */
    @Export(name="eventDeliveryFailureTopicArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> eventDeliveryFailureTopicArn;

    /**
     * @return SNS Topic triggered when a delivery to any of the platform endpoints associated with your platform application encounters a permanent failure.
     * 
     */
    public Output</* @Nullable */ String> getEventDeliveryFailureTopicArn() {
        return this.eventDeliveryFailureTopicArn;
    }
    /**
     * SNS Topic triggered when a new platform endpoint is added to your platform application.
     * 
     */
    @Export(name="eventEndpointCreatedTopicArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> eventEndpointCreatedTopicArn;

    /**
     * @return SNS Topic triggered when a new platform endpoint is added to your platform application.
     * 
     */
    public Output</* @Nullable */ String> getEventEndpointCreatedTopicArn() {
        return this.eventEndpointCreatedTopicArn;
    }
    /**
     * SNS Topic triggered when an existing platform endpoint is deleted from your platform application.
     * 
     */
    @Export(name="eventEndpointDeletedTopicArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> eventEndpointDeletedTopicArn;

    /**
     * @return SNS Topic triggered when an existing platform endpoint is deleted from your platform application.
     * 
     */
    public Output</* @Nullable */ String> getEventEndpointDeletedTopicArn() {
        return this.eventEndpointDeletedTopicArn;
    }
    /**
     * SNS Topic triggered when an existing platform endpoint is changed from your platform application.
     * 
     */
    @Export(name="eventEndpointUpdatedTopicArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> eventEndpointUpdatedTopicArn;

    /**
     * @return SNS Topic triggered when an existing platform endpoint is changed from your platform application.
     * 
     */
    public Output</* @Nullable */ String> getEventEndpointUpdatedTopicArn() {
        return this.eventEndpointUpdatedTopicArn;
    }
    /**
     * The IAM role permitted to receive failure feedback for this application.
     * 
     */
    @Export(name="failureFeedbackRoleArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> failureFeedbackRoleArn;

    /**
     * @return The IAM role permitted to receive failure feedback for this application.
     * 
     */
    public Output</* @Nullable */ String> getFailureFeedbackRoleArn() {
        return this.failureFeedbackRoleArn;
    }
    /**
     * The friendly name for the SNS platform application
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The friendly name for the SNS platform application
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The platform that the app is registered with. See [Platform](http://docs.aws.amazon.com/sns/latest/dg/mobile-push-send-register.html) for supported platforms.
     * 
     */
    @Export(name="platform", type=String.class, parameters={})
    private Output<String> platform;

    /**
     * @return The platform that the app is registered with. See [Platform](http://docs.aws.amazon.com/sns/latest/dg/mobile-push-send-register.html) for supported platforms.
     * 
     */
    public Output<String> getPlatform() {
        return this.platform;
    }
    /**
     * Application Platform credential. See [Credential](http://docs.aws.amazon.com/sns/latest/dg/mobile-push-send-register.html) for type of credential required for platform. The value of this attribute when stored into the state is only a hash of the real value, so therefore it is not practical to use this as an attribute for other resources.
     * 
     */
    @Export(name="platformCredential", type=String.class, parameters={})
    private Output<String> platformCredential;

    /**
     * @return Application Platform credential. See [Credential](http://docs.aws.amazon.com/sns/latest/dg/mobile-push-send-register.html) for type of credential required for platform. The value of this attribute when stored into the state is only a hash of the real value, so therefore it is not practical to use this as an attribute for other resources.
     * 
     */
    public Output<String> getPlatformCredential() {
        return this.platformCredential;
    }
    /**
     * Application Platform principal. See [Principal](http://docs.aws.amazon.com/sns/latest/api/API_CreatePlatformApplication.html) for type of principal required for platform. The value of this attribute when stored into the state is only a hash of the real value, so therefore it is not practical to use this as an attribute for other resources.
     * 
     */
    @Export(name="platformPrincipal", type=String.class, parameters={})
    private Output</* @Nullable */ String> platformPrincipal;

    /**
     * @return Application Platform principal. See [Principal](http://docs.aws.amazon.com/sns/latest/api/API_CreatePlatformApplication.html) for type of principal required for platform. The value of this attribute when stored into the state is only a hash of the real value, so therefore it is not practical to use this as an attribute for other resources.
     * 
     */
    public Output</* @Nullable */ String> getPlatformPrincipal() {
        return this.platformPrincipal;
    }
    /**
     * The IAM role permitted to receive success feedback for this application.
     * 
     */
    @Export(name="successFeedbackRoleArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> successFeedbackRoleArn;

    /**
     * @return The IAM role permitted to receive success feedback for this application.
     * 
     */
    public Output</* @Nullable */ String> getSuccessFeedbackRoleArn() {
        return this.successFeedbackRoleArn;
    }
    /**
     * The percentage of success to sample (0-100)
     * 
     */
    @Export(name="successFeedbackSampleRate", type=String.class, parameters={})
    private Output</* @Nullable */ String> successFeedbackSampleRate;

    /**
     * @return The percentage of success to sample (0-100)
     * 
     */
    public Output</* @Nullable */ String> getSuccessFeedbackSampleRate() {
        return this.successFeedbackSampleRate;
    }

    public interface BuilderApplicator {
        public void apply(PlatformApplicationArgs.Builder a);
    }
    private static io.pulumi.aws.sns.PlatformApplicationArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.sns.PlatformApplicationArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public PlatformApplication(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PlatformApplication(String name) {
        this(name, PlatformApplicationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PlatformApplication(String name, PlatformApplicationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PlatformApplication(String name, PlatformApplicationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:sns/platformApplication:PlatformApplication", name, args == null ? PlatformApplicationArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private PlatformApplication(String name, Output<String> id, @Nullable PlatformApplicationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:sns/platformApplication:PlatformApplication", name, state, makeResourceOptions(options, id));
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
    public static PlatformApplication get(String name, Output<String> id, @Nullable PlatformApplicationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new PlatformApplication(name, id, state, options);
    }
}
