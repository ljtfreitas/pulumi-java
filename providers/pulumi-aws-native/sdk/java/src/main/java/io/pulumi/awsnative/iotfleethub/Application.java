// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotfleethub;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.iotfleethub.ApplicationArgs;
import io.pulumi.awsnative.iotfleethub.outputs.ApplicationTag;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource schema for AWS::IoTFleetHub::Application
 * 
 */
@ResourceType(type="aws-native:iotfleethub:Application")
public class Application extends io.pulumi.resources.CustomResource {
    /**
     * The ARN of the application.
     * 
     */
    @Export(name="applicationArn", type=String.class, parameters={})
    private Output<String> applicationArn;

    /**
     * @return The ARN of the application.
     * 
     */
    public Output<String> getApplicationArn() {
        return this.applicationArn;
    }
    /**
     * When the Application was created
     * 
     */
    @Export(name="applicationCreationDate", type=Integer.class, parameters={})
    private Output<Integer> applicationCreationDate;

    /**
     * @return When the Application was created
     * 
     */
    public Output<Integer> getApplicationCreationDate() {
        return this.applicationCreationDate;
    }
    /**
     * Application Description, should be between 1 and 2048 characters.
     * 
     */
    @Export(name="applicationDescription", type=String.class, parameters={})
    private Output</* @Nullable */ String> applicationDescription;

    /**
     * @return Application Description, should be between 1 and 2048 characters.
     * 
     */
    public Output</* @Nullable */ String> getApplicationDescription() {
        return this.applicationDescription;
    }
    /**
     * The ID of the application.
     * 
     */
    @Export(name="applicationId", type=String.class, parameters={})
    private Output<String> applicationId;

    /**
     * @return The ID of the application.
     * 
     */
    public Output<String> getApplicationId() {
        return this.applicationId;
    }
    /**
     * When the Application was last updated
     * 
     */
    @Export(name="applicationLastUpdateDate", type=Integer.class, parameters={})
    private Output<Integer> applicationLastUpdateDate;

    /**
     * @return When the Application was last updated
     * 
     */
    public Output<Integer> getApplicationLastUpdateDate() {
        return this.applicationLastUpdateDate;
    }
    /**
     * Application Name, should be between 1 and 256 characters.
     * 
     */
    @Export(name="applicationName", type=String.class, parameters={})
    private Output<String> applicationName;

    /**
     * @return Application Name, should be between 1 and 256 characters.
     * 
     */
    public Output<String> getApplicationName() {
        return this.applicationName;
    }
    /**
     * The current state of the application.
     * 
     */
    @Export(name="applicationState", type=String.class, parameters={})
    private Output<String> applicationState;

    /**
     * @return The current state of the application.
     * 
     */
    public Output<String> getApplicationState() {
        return this.applicationState;
    }
    /**
     * The URL of the application.
     * 
     */
    @Export(name="applicationUrl", type=String.class, parameters={})
    private Output<String> applicationUrl;

    /**
     * @return The URL of the application.
     * 
     */
    public Output<String> getApplicationUrl() {
        return this.applicationUrl;
    }
    /**
     * A message indicating why Create or Delete Application failed.
     * 
     */
    @Export(name="errorMessage", type=String.class, parameters={})
    private Output<String> errorMessage;

    /**
     * @return A message indicating why Create or Delete Application failed.
     * 
     */
    public Output<String> getErrorMessage() {
        return this.errorMessage;
    }
    /**
     * The ARN of the role that the web application assumes when it interacts with AWS IoT Core. For more info on configuring this attribute, see https://docs.aws.amazon.com/iot/latest/apireference/API_iotfleethub_CreateApplication.html#API_iotfleethub_CreateApplication_RequestSyntax
     * 
     */
    @Export(name="roleArn", type=String.class, parameters={})
    private Output<String> roleArn;

    /**
     * @return The ARN of the role that the web application assumes when it interacts with AWS IoT Core. For more info on configuring this attribute, see https://docs.aws.amazon.com/iot/latest/apireference/API_iotfleethub_CreateApplication.html#API_iotfleethub_CreateApplication_RequestSyntax
     * 
     */
    public Output<String> getRoleArn() {
        return this.roleArn;
    }
    /**
     * The AWS SSO application generated client ID (used with AWS SSO APIs).
     * 
     */
    @Export(name="ssoClientId", type=String.class, parameters={})
    private Output<String> ssoClientId;

    /**
     * @return The AWS SSO application generated client ID (used with AWS SSO APIs).
     * 
     */
    public Output<String> getSsoClientId() {
        return this.ssoClientId;
    }
    /**
     * A list of key-value pairs that contain metadata for the application.
     * 
     */
    @Export(name="tags", type=List.class, parameters={ApplicationTag.class})
    private Output</* @Nullable */ List<ApplicationTag>> tags;

    /**
     * @return A list of key-value pairs that contain metadata for the application.
     * 
     */
    public Output</* @Nullable */ List<ApplicationTag>> getTags() {
        return this.tags;
    }

    public interface BuilderApplicator {
        public void apply(ApplicationArgs.Builder a);
    }
    private static io.pulumi.awsnative.iotfleethub.ApplicationArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.iotfleethub.ApplicationArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Application(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Application(String name) {
        this(name, ApplicationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Application(String name, ApplicationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Application(String name, ApplicationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:iotfleethub:Application", name, args == null ? ApplicationArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Application(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:iotfleethub:Application", name, null, makeResourceOptions(options, id));
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
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Application get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Application(name, id, options);
    }
}
