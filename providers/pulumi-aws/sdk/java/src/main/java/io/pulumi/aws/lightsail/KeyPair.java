// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lightsail;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.lightsail.KeyPairArgs;
import io.pulumi.aws.lightsail.inputs.KeyPairState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a Lightsail Key Pair, for use with Lightsail Instances. These key pairs
 * are separate from EC2 Key Pairs, and must be created or imported for use with
 * Lightsail.
 * 
 * > **Note:** Lightsail is currently only supported in a limited number of AWS Regions, please see ["Regions and Availability Zones in Amazon Lightsail"](https://lightsail.aws.amazon.com/ls/docs/overview/article/understanding-regions-and-availability-zones-in-amazon-lightsail) for more details
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Lightsail Key Pairs cannot be imported, because the private and public key are only available on initial creation.
 * 
 */
@ResourceType(type="aws:lightsail/keyPair:KeyPair")
public class KeyPair extends io.pulumi.resources.CustomResource {
    /**
     * The ARN of the Lightsail key pair
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN of the Lightsail key pair
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The MD5 public key fingerprint for the encrypted
     * private key
     * 
     */
    @Export(name="encryptedFingerprint", type=String.class, parameters={})
    private Output<String> encryptedFingerprint;

    /**
     * @return The MD5 public key fingerprint for the encrypted
     * private key
     * 
     */
    public Output<String> getEncryptedFingerprint() {
        return this.encryptedFingerprint;
    }
    /**
     * the private key material, base 64 encoded and
     * encrypted with the given `pgp_key`. This is only populated when creating a new
     * key and `pgp_key` is supplied
     * 
     */
    @Export(name="encryptedPrivateKey", type=String.class, parameters={})
    private Output<String> encryptedPrivateKey;

    /**
     * @return the private key material, base 64 encoded and
     * encrypted with the given `pgp_key`. This is only populated when creating a new
     * key and `pgp_key` is supplied
     * 
     */
    public Output<String> getEncryptedPrivateKey() {
        return this.encryptedPrivateKey;
    }
    /**
     * The MD5 public key fingerprint as specified in section 4 of RFC 4716.
     * 
     */
    @Export(name="fingerprint", type=String.class, parameters={})
    private Output<String> fingerprint;

    /**
     * @return The MD5 public key fingerprint as specified in section 4 of RFC 4716.
     * 
     */
    public Output<String> getFingerprint() {
        return this.fingerprint;
    }
    /**
     * The name of the Lightsail Key Pair. If omitted, a unique
     * name will be generated by this provider
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the Lightsail Key Pair. If omitted, a unique
     * name will be generated by this provider
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    @Export(name="namePrefix", type=String.class, parameters={})
    private Output</* @Nullable */ String> namePrefix;

    public Output</* @Nullable */ String> getNamePrefix() {
        return this.namePrefix;
    }
    /**
     * An optional PGP key to encrypt the resulting private
     * key material. Only used when creating a new key pair
     * 
     */
    @Export(name="pgpKey", type=String.class, parameters={})
    private Output</* @Nullable */ String> pgpKey;

    /**
     * @return An optional PGP key to encrypt the resulting private
     * key material. Only used when creating a new key pair
     * 
     */
    public Output</* @Nullable */ String> getPgpKey() {
        return this.pgpKey;
    }
    /**
     * the private key, base64 encoded. This is only populated
     * when creating a new key, and when no `pgp_key` is provided
     * 
     */
    @Export(name="privateKey", type=String.class, parameters={})
    private Output<String> privateKey;

    /**
     * @return the private key, base64 encoded. This is only populated
     * when creating a new key, and when no `pgp_key` is provided
     * 
     */
    public Output<String> getPrivateKey() {
        return this.privateKey;
    }
    /**
     * The public key material. This public key will be
     * imported into Lightsail
     * 
     */
    @Export(name="publicKey", type=String.class, parameters={})
    private Output<String> publicKey;

    /**
     * @return The public key material. This public key will be
     * imported into Lightsail
     * 
     */
    public Output<String> getPublicKey() {
        return this.publicKey;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable KeyPairArgs.Builder a);
    }
    private static io.pulumi.aws.lightsail.KeyPairArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.lightsail.KeyPairArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public KeyPair(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public KeyPair(String name) {
        this(name, KeyPairArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public KeyPair(String name, @Nullable KeyPairArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public KeyPair(String name, @Nullable KeyPairArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:lightsail/keyPair:KeyPair", name, args == null ? KeyPairArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private KeyPair(String name, Output<String> id, @Nullable KeyPairState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:lightsail/keyPair:KeyPair", name, state, makeResourceOptions(options, id));
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
    public static KeyPair get(String name, Output<String> id, @Nullable KeyPairState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new KeyPair(name, id, state, options);
    }
}
