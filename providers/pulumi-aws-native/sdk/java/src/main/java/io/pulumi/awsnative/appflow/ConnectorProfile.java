// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.appflow.ConnectorProfileArgs;
import io.pulumi.awsnative.appflow.enums.ConnectorProfileConnectionMode;
import io.pulumi.awsnative.appflow.enums.ConnectorProfileConnectorType;
import io.pulumi.awsnative.appflow.outputs.ConnectorProfileConfig;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::AppFlow::ConnectorProfile
 * 
 */
@ResourceType(type="aws-native:appflow:ConnectorProfile")
public class ConnectorProfile extends io.pulumi.resources.CustomResource {
    /**
     * Mode in which data transfer should be enabled. Private connection mode is currently enabled for Salesforce, Snowflake, Trendmicro and Singular
     * 
     */
    @Export(name="connectionMode", type=ConnectorProfileConnectionMode.class, parameters={})
    private Output<ConnectorProfileConnectionMode> connectionMode;

    /**
     * @return Mode in which data transfer should be enabled. Private connection mode is currently enabled for Salesforce, Snowflake, Trendmicro and Singular
     * 
     */
    public Output<ConnectorProfileConnectionMode> getConnectionMode() {
        return this.connectionMode;
    }
    /**
     * Unique identifier for connector profile resources
     * 
     */
    @Export(name="connectorProfileArn", type=String.class, parameters={})
    private Output<String> connectorProfileArn;

    /**
     * @return Unique identifier for connector profile resources
     * 
     */
    public Output<String> getConnectorProfileArn() {
        return this.connectorProfileArn;
    }
    /**
     * Connector specific configurations needed to create connector profile
     * 
     */
    @Export(name="connectorProfileConfig", type=ConnectorProfileConfig.class, parameters={})
    private Output</* @Nullable */ ConnectorProfileConfig> connectorProfileConfig;

    /**
     * @return Connector specific configurations needed to create connector profile
     * 
     */
    public Output</* @Nullable */ ConnectorProfileConfig> getConnectorProfileConfig() {
        return this.connectorProfileConfig;
    }
    /**
     * The maximum number of items to retrieve in a single batch.
     * 
     */
    @Export(name="connectorProfileName", type=String.class, parameters={})
    private Output<String> connectorProfileName;

    /**
     * @return The maximum number of items to retrieve in a single batch.
     * 
     */
    public Output<String> getConnectorProfileName() {
        return this.connectorProfileName;
    }
    /**
     * List of Saas providers that need connector profile to be created
     * 
     */
    @Export(name="connectorType", type=ConnectorProfileConnectorType.class, parameters={})
    private Output<ConnectorProfileConnectorType> connectorType;

    /**
     * @return List of Saas providers that need connector profile to be created
     * 
     */
    public Output<ConnectorProfileConnectorType> getConnectorType() {
        return this.connectorType;
    }
    /**
     * A unique Arn for Connector-Profile resource
     * 
     */
    @Export(name="credentialsArn", type=String.class, parameters={})
    private Output<String> credentialsArn;

    /**
     * @return A unique Arn for Connector-Profile resource
     * 
     */
    public Output<String> getCredentialsArn() {
        return this.credentialsArn;
    }
    /**
     * The ARN of the AWS Key Management Service (AWS KMS) key that's used to encrypt your function's environment variables. If it's not provided, AWS Lambda uses a default service key.
     * 
     */
    @Export(name="kMSArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> kMSArn;

    /**
     * @return The ARN of the AWS Key Management Service (AWS KMS) key that's used to encrypt your function's environment variables. If it's not provided, AWS Lambda uses a default service key.
     * 
     */
    public Output</* @Nullable */ String> getKMSArn() {
        return this.kMSArn;
    }

    public interface BuilderApplicator {
        public void apply(ConnectorProfileArgs.Builder a);
    }
    private static io.pulumi.awsnative.appflow.ConnectorProfileArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.appflow.ConnectorProfileArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public ConnectorProfile(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ConnectorProfile(String name) {
        this(name, ConnectorProfileArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ConnectorProfile(String name, ConnectorProfileArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ConnectorProfile(String name, ConnectorProfileArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:appflow:ConnectorProfile", name, args == null ? ConnectorProfileArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private ConnectorProfile(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:appflow:ConnectorProfile", name, null, makeResourceOptions(options, id));
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
    public static ConnectorProfile get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ConnectorProfile(name, id, options);
    }
}
