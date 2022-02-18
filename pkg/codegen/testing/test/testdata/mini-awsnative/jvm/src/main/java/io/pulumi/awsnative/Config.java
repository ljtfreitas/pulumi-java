// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative;

import io.pulumi.awsnative.config.inputs.IgnoreTags;
import io.pulumi.core.TypeShape;
import java.lang.String;
import java.util.Optional;

public final class Config {

    private static final io.pulumi.Config config = io.pulumi.Config.of("aws-native");
/**
 * Configuration block with resource tag settings to ignore across all resources handled by this provider (except any individual service tag resources such as `ec2.Tag`) for situations where external systems are managing certain resource tags.
 * 
 */
    public Optional<IgnoreTags> ignoreTags() {
        return config.getObject("ignoreTags",TypeShape.<IgnoreTags>builder(IgnoreTags.class).build());
    }
/**
 * The region where AWS operations will take place. Examples are `us-east-1`, `us-west-2`, etc.
 * 
 */
    public Optional<String> region() {
        return config.getObject("region",TypeShape.<String>builder(String.class).build());
    }
}
